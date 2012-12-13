package com.didaku.timeaxis.engine;

import java.util.Map;

import com.didaku.orm.interfaces.IStorage;
import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.IBooking;
import com.didaku.timeaxis.base.interfaces.IPipeline;
import com.didaku.timeaxis.base.interfaces.ITransaction;
import com.didaku.timeaxis.environment.repository.Cache;
import com.didaku.timeaxis.environment.storage.Storages;

public class BookingAsking
{
	public boolean ask(final String userId, final String bookingId)
	{
		// 来了一个预约请求,
		// 找到用户，从用户的所有预约中找到匹配的预约
		IBooking booking = Cache.getUserMap().get(userId).getBookings().get(bookingId);

		// 通过预约，找到该预约匹配的工作流水线，并获取该流水线上的第一个动作
		String pipelineId = booking.getPipelineId();
		IPipeline pipeline = pipelineMap.get(pipelineId);
		String activityId = pipeline.getActivities().getFirst();
		IActivity activity = activityMap.get(activityId);

		// 生成这（第一个）动作的执行参数
		IActiveRequest request = activity.buildRequest();

		// 生成一个将被填充内容的动作记录
		ITransaction transaction = activity.buildTransaction();

		// 执行动作
		boolean success = activity.execute(request, transaction);

		if (success)
		{
			// 动作成功后，持久化动作记录
			IStorage<ITransaction> storage = Storages.getRecordStorage(ITransaction.class);
			storage.add(transaction);
		}

		return true;
	}

	private Map<String, IPipeline> pipelineMap;
	private Map<String, IActivity> activityMap;

	public static void main(final String[] args)
	{
		BookingAsking asking = new BookingAsking();
		asking.ask("00", "11");
	}
}
