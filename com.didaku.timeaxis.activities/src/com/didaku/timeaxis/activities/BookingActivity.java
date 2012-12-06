package com.didaku.timeaxis.activities;

import java.util.Date;

import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.ITransaction;

public class BookingActivity implements IActivity
{

	@Override
	public boolean execute(final IActiveRequest request, final ITransaction transaction)
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public IActiveRequest buildRequest()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ITransaction buildTransaction()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	// IActivity需要持久化，所以也继承自IEntity，以下是IEntity的接口标准内容

	@Override
	public String getId()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setId(final String id)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public String getName()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void setName(final String name)
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

}
