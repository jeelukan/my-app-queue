package com.didaku.timeaxis.activities;

import javax.inject.Inject;
import javax.inject.Named;

import com.didaku.timeaxis.base.BaseActivity;
import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.didaku.timeaxis.base.interfaces.ITransaction;

public class BookingActivity extends BaseActivity
{
	@Override
	public boolean execute(final IActiveRequest request, final ITransaction transaction)
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Inject
	@Override
	protected void setRequest(@Named("Booking") final IActiveRequest activeRequest)
	{
		_ActiveRequest = activeRequest;
	}

	@Inject
	@Override
	protected void setTransaction(@Named("Booking") final ITransaction transaction)
	{
		_Transaction = transaction;
	}
}
