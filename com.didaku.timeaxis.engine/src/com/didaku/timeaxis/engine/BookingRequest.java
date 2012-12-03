package com.didaku.timeaxis.engine;

import java.util.Map;

import com.didaku.orm.interfaces.IStorage;
import com.didaku.timeaxis.base.interfaces.IActiveParams;
import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.IBooking;
import com.didaku.timeaxis.base.interfaces.IPipeline;
import com.didaku.timeaxis.base.interfaces.ITransaction;
import com.didaku.timeaxis.environment.storage.Storages;

public class BookingRequest
{
	public boolean answer(final String userId, final String bookingId)
	{
		// 来了一个预约请求
		IBooking booking = bookingMap.get(bookingId);
		String pipelineId = booking.getPipelineId();
		IPipeline pipeline = pipelineMap.get(pipelineId);
		String activityId = pipeline.getActivities().getFirst();
		IActivity activity = activityMap.get(activityId);
		IActiveParams params = activity.findParam();
		ITransaction transaction = activity.buildTransaction();
		boolean success = activity.execute(params, transaction);
		if (success)
		{
			IStorage<ITransaction> storage = Storages.getStorage(ITransaction.class);
			storage.add(transaction);
		}

		return true;
	}

	private Map<String, IBooking> bookingMap;
	private Map<String, IPipeline> pipelineMap;
	private Map<String, IActivity> activityMap;
}
