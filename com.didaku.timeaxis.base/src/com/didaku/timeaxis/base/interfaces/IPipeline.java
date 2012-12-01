package com.didaku.timeaxis.base.interfaces;

import java.util.LinkedList;

import com.didaku.common.interfaces.IEntity;

/**
 * 描述一个工作流水线
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface IPipeline extends IEntity
{
	/**
	 * 获取流水线的各个动作的Activity的ID的顺序链表
	 * 
	 * @return 流水线的各个动作的Activity的ID的顺序链表
	 */
	LinkedList<String> getActivities();

	/**
	 * 设置流水线的各个动作的Activity的ID的顺序链表
	 * 
	 * @param activities
	 *            流水线的各个动作的Activity的ID的顺序链表
	 */
	void setActivities(LinkedList<String> activities);
}
