package com.didaku.timeaxis.base;

import java.util.Date;
import java.util.UUID;

import com.didaku.timeaxis.base.interfaces.ITransaction;

public abstract class BaseTransaction implements ITransaction
{
	protected BaseTransaction()
	{
		_Id = UUID.randomUUID().toString();
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

	private String _Identifier;

	@Override
	public String getIdentifier()
	{
		return _Identifier;
	}

	@Override
	public void setIdentifier(final String identifier)
	{
		_Identifier = identifier;
	}

	private String _Booking;

	@Override
	public String getBooking()
	{
		return _Booking;
	}

	@Override
	public void setBooking(final String bookingId)
	{
		_Booking = bookingId;
	}

	private String _TimeaxisId;

	@Override
	public String getTimeaxis()
	{
		return _TimeaxisId;
	}

	@Override
	public void setTimeaxis(final String timeaxisId)
	{
		_TimeaxisId = timeaxisId;
	}

	private Date _Time;

	@Override
	public Date getTime()
	{
		return _Time;
	}

	@Override
	public void setTime(final Date beginTime)
	{
		_Time = beginTime;
	}

	private String _User;

	@Override
	public String getUser()
	{
		return _User;
	}

	@Override
	public void setUser(final String userId)
	{
		_User = userId;
	}

	private String _Owner;

	@Override
	public String getOwner()
	{
		return _Owner;
	}

	@Override
	public void setOwner(final String activityId)
	{
		_Owner = activityId;
	}

	private String[] _Previous;

	@Override
	public String[] getPrevious()
	{
		return _Previous;
	}

	@Override
	public void setPrevious(final String[] previousTransactionIds)
	{
		_Previous = previousTransactionIds;
	}

	@Override
	public String toString()
	{
		return _Id;
	}
}
