package com.didaku.timeaxis.environment.DI;

import com.didaku.timeaxis.activities.BookingActivity;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Env
{
	private static Injector _Injector;

	public static Injector getInject()
	{
		if (_Injector == null)
			_Injector = Guice.createInjector(new GuiceModule());
		return _Injector;
	}

	public static void main(final String[] args)
	{
		BookingActivity test = getInject().getInstance(BookingActivity.class);
		System.out.println(test.buildRequest());
		System.out.println(test.buildTransaction());
	}
}
