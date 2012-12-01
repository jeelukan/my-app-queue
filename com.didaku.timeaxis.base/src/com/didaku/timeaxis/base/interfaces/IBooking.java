package com.didaku.timeaxis.base.interfaces;

import com.didaku.common.interfaces.IEntity;

/**
 * 预约。所有事件的起点。
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface IBooking extends IEntity
{
	/**
	 * 获取被预约的工作流的Id
	 * 
	 * @return 被预约的工作流的Id
	 */
	String getPipelineId();

	/**
	 * 设置被预约的工作流的Id
	 * 
	 * @param pipelineId
	 *            被预约的工作流的Id
	 */
	void setPipeLineId(String pipelineId);
}
