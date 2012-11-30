package com.didaku.timeaxis.entities;

import java.util.Date;

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

	@Override
	public String getOwner()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setOwner(final String id)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean getIsDeleted()
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void setIsDeleted(final boolean isDeleted)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public String getCreator()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setCreator(final String creator)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public String getCreatedTime()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setCreatedTime(final String createdTime)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public String getEditor()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setEditor(final String editor)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public Date getEditedTime()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setEditedTime(final Date editedTime)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public int getType()
	{
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public void setType(final int type)
	{
		// TODO 自动生成的方法存根

	}

}
