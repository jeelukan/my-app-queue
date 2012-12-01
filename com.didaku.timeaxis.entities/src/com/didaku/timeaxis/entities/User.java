package com.didaku.timeaxis.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.IBooking;
import com.didaku.timeaxis.base.interfaces.IPipeline;
import com.didaku.timeaxis.base.interfaces.ITimeaxis;
import com.didaku.timeaxis.base.interfaces.ITransaction;
import com.didaku.timeaxis.base.interfaces.IUser;

public class User implements IUser
{

	@Override
	public void setId(final String id)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public String getDetail()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setDetail(final String detail)
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
	public String getId()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getLoginName()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getName()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getNumber()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getEmail()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getMobilePhone()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public IActivity getBookingActivity()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Map<String, ITimeaxis> getTimeaxises()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ArrayList<IBooking> getBookings()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Map<String, IPipeline> getPipelines()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean Assign(final String queueId, final ITransaction transaction)
	{
		// TODO 自动生成的方法存根
		return false;
	}

}
