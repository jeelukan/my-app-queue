package com.didaku.timeaxis.base.interfaces;

import java.util.Map;

import com.didaku.common.interfaces.IEntity;

/**
 * 领域核心定义:系统的用户。这个用户的概念比较宽，可以是个人，银行网点，餐馆等等。
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface IUser extends IEntity
{
	// / <summary>用户登录名
	// / </summary>
	String getLoginName();

	// / <summary>用户名称
	// / </summary>
	@Override
	String getName();

	// / <summary>用户编号，这个编号一般是用户自己设置。
	// / </summary>
	String getNumber();

	// / <summary>电子邮件
	// / </summary>
	String getEmail();

	// / <summary>手机号码
	// / </summary>
	String getMobilePhone();

	// / <summary>用户的时间资源的预约动作。
	// / </summary>
	IActivity getBookingActivity();

	// / <summary>用户所拥有的时间资源
	// / </summary>
	Map<String, ITimeaxis> getTimeaxises();

	// / <summary>用户存在的预约
	// / </summary>
	Map<String, IBooking> getBookings();

	// / <summary>用户的流水线
	// / </summary>
	Map<String, IPipeline> getPipelines();

	// / <summary>分配指定的队列所拥有预约
	// / </summary>
	// / <param name="queueId">指定的队列</param>
	// / <param name="transaction">描述预约的交易 </param>
	// / <returns>是否分配成功</returns>
	boolean Assign(String queueId, ITransaction transaction);
}
