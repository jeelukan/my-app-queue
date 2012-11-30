package com.didaku.timeaxis.base.interfaces;

import com.didaku.common.interfaces.IEntity;

/**
 * 核心实体接口。描述一个资源的时间轴。<br>
 * 其中，资源：可以是一个人(User)，针对这个人他会拥有一个时间轴；当在排队系统中时，一个营业厅的每个柜台拥有一个时间轴。<br>
 * 时间轴：一个与现实世界的时间完全吻合的概念，随着时间的推移，在这个时间轴上的每个节点都可能发生事件。
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface ITimeaxis extends IEntity
{
	/**
	 * 获取本时间轴的拥有者的ID
	 * 
	 * @return 本时间轴的拥有者的ID
	 */
	public String getOwner();

	/**
	 * 设置本时间轴的拥有者的ID
	 * 
	 * @param id
	 *            本时间轴的拥有者的ID
	 */
	public void setOwner(final String id);

	/**
	 * 获取时间轴类型
	 * 
	 * @return 时间轴类型
	 */
	public int getType();

	/**
	 * 设置时间轴类型
	 * 
	 * @param type
	 *            时间轴类型
	 */
	public void setType(int type);

}
