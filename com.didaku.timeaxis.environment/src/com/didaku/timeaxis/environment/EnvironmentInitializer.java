package com.didaku.timeaxis.environment;

import com.didaku.common.interfaces.IInitializer;

public class EnvironmentInitializer implements IInitializer
{

	private boolean _IsInitialized = false;

	@Override
	public boolean IsInitialized()
	{
		return _IsInitialized;
	}

	@Override
	public boolean Initialize(final Object[] args)
	{
		_IsInitialized = true;
		return true;
	}

}
