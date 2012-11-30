package com.didaku.timeaxis.entities;

import com.didaku.timeaxis.base.interfaces.ITimeaxis;

/**
 * 核心实体接口。描述一个资源的时间轴。<br>
 * 其中，资源：可以是一个人(User)，针对这个人他会拥有一个时间轴；当在排队系统中时，一个营业厅的每个柜台拥有一个时间轴。<br>
 * 时间轴：一个与现实世界的时间完全吻合的概念，随着时间的推移，在这个时间轴上的每个节点都可能发生事件。
 * 
 * @author lukan@jeelu.com
 * 
 */
public class Timeaxis implements ITimeaxis
{
	private String _Id;

	@Override
	public String getId()
	{
		return _Id;
	}

	@Override
	public void setId(final String id)
	{
		_Id = id;
	}

	private String _Detail;

	@Override
	public String getDetail()
	{
		return _Detail;
	}

	@Override
	public void setDetail(final String detail)
	{
		_Detail = detail;
	}

}
