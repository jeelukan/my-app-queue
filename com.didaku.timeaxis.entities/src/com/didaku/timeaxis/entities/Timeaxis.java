package com.didaku.timeaxis.entities;

import com.didaku.timeaxis.base.interfaces.IEntity;

public class Timeaxis implements IEntity
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

}
