package com.didaku.timeaxis.engine;

import java.util.Map;

import com.didaku.orm.interfaces.IStorage;
import com.didaku.timeaxis.base.interfaces.IActiveParams;
import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.IBooking;
import com.didaku.timeaxis.base.interfaces.IPipeline;
import com.didaku.timeaxis.base.interfaces.ITransaction;
import com.didaku.timeaxis.environment.repository.Cache;
import com.didaku.timeaxis.environment.storage.Storages;

public class BookingRequest
{
	public boolean answer(final String userId, final String bookingId)
	{
		// 来了一个预约请求
		IBooking booking = Cache.getUserMap().get(userId).getBookings().get(bookingId);
		String pipelineId = booking.getPipelineId();
		IPipeline pipeline = pipelineMap.get(pipelineId);
		String activityId = pipeline.getActivities().getFirst();
		IActivity activity = activityMap.get(activityId);
		IActiveParams params = activity.buildParam();
		ITransaction transaction = activity.buildTransaction();
		boolean success = activity.execute(params, transaction);
		if (success)
		{
			IStorage<ITransaction> storage = Storages.getRecordStorage(ITransaction.class);
			storage.add(transaction);
		}

		return true;
	}

	private Map<String, IPipeline> pipelineMap;
	private Map<String, IActivity> activityMap;
}
