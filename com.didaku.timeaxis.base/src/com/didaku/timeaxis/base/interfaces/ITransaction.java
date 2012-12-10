package com.didaku.timeaxis.base.interfaces;

import java.util.Date;

import com.didaku.common.interfaces.IRecord;

/**
 * 记录一个时间轴中每个动作的记录信息
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface ITransaction extends IRecord
{
	/**
	 * 获取识别码。这个识别码仅限定在短暂的时间内(当天，中午等)是不重复的。在排队系统中，这将是一个排队的票号。
	 * 
	 * @return 识别码
	 */
	public String getIdentifier();

	/**
	 * 设置识别码。这个识别码仅限定在短暂的时间内(当天，中午等)是不重复的。在排队系统中，这将是一个排队的票号。
	 * 
	 * @param identifier
	 *            识别码
	 */
	public void setIdentifier(final String identifier);

	/**
	 * 设置最初的预约ID
	 * 
	 * @return 最初的预约ID
	 */
	public String getBooking();

	/**
	 * 获取最初的预约ID
	 * 
	 * @param bookingId
	 *            最初的预约ID
	 */
	public void setBooking(final String bookingId);

	/**
	 * 设置所属时间轴的ID
	 * 
	 * @return 所属时间轴的ID
	 */
	public String getTimeaxis();

	/**
	 * 获取所属时间轴的ID
	 * 
	 * @param timeaxisId
	 *            所属时间轴的ID
	 */
	public void setTimeaxis(final String timeaxisId);

	/**
	 * 获取当前记录的开始时间。
	 * 
	 * @return 当前记录的开始时间。
	 */
	public Date getTime();

	/**
	 * 设置当前记录的开始时间。
	 * 
	 * @param beginTime
	 *            当前记录的开始时间。
	 */
	public void setTime(final Date beginTime);

	/**
	 * 获取本记录关联用户的ID
	 * 
	 * @return 本记录关联用户的ID
	 */
	public String getUser();

	/**
	 * 设置本记录关联用户的ID
	 * 
	 * @param userId
	 *            本记录关联用户的ID
	 */
	public void setUser(final String userId);

	/**
	 * 获取产生本记录的动作Id
	 * 
	 * @return 产生本记录的动作Id
	 */
	public String getOwner();

	/**
	 * 设置产生本记录的动作Id
	 * 
	 * @param activityId
	 *            产生本记录的动作Id
	 */
	public void setOwner(final String activityId);

	/**
	 * 获取前置的记录的ID的集合
	 * 
	 * @return 前置的记录的ID的集合
	 */
	public String[] getPrevious();

	/**
	 * 设置前置的记录的ID的集合
	 * 
	 * @param previousTransactionIds
	 *            前置的记录的ID的集合
	 */
	public void setPrevious(final String[] previousTransactionIds);
}
