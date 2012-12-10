package com.didaku.timeaxis.base;

import java.util.Date;

import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.didaku.timeaxis.base.interfaces.IActivity;
import com.didaku.timeaxis.base.interfaces.ITransaction;

public abstract class BaseActivity implements IActivity
{
	protected IActiveRequest _ActiveRequest;

	protected abstract void setRequest(final IActiveRequest activeRequest);

	@Override
	public IActiveRequest buildRequest()
	{
		return _ActiveRequest;
	}

	protected ITransaction _Transaction;

	protected abstract void setTransaction(final ITransaction transaction);

	@Override
	public ITransaction buildTransaction()
	{
		return _Transaction;
	}

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

	private String _Name;

	@Override
	public String getName()
	{
		return _Name;
	}

	@Override
	public void setName(final String name)
	{
		_Name = name;
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

	private boolean _IsDeleted;

	@Override
	public boolean getIsDeleted()
	{
		return _IsDeleted;
	}

	@Override
	public void setIsDeleted(final boolean isDeleted)
	{
		_IsDeleted = isDeleted;
	}

	private String _Creator;

	@Override
	public String getCreator()
	{
		return _Creator;
	}

	@Override
	public void setCreator(final String creator)
	{
		_Creator = creator;
	}

	private String _CreatedTime;

	@Override
	public String getCreatedTime()
	{
		return _CreatedTime;
	}

	@Override
	public void setCreatedTime(final String createdTime)
	{
		_CreatedTime = createdTime;
	}

	private String _Editor;

	@Override
	public String getEditor()
	{
		return _Editor;
	}

	@Override
	public void setEditor(final String editor)
	{
		_Editor = editor;
	}

	private Date _EditedTime;

	@Override
	public Date getEditedTime()
	{
		return _EditedTime;
	}

	@Override
	public void setEditedTime(final Date editedTime)
	{
		_EditedTime = editedTime;
	}

}
