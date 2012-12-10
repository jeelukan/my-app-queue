package com.didaku.timeaxis.environment.DI;

import com.didaku.timeaxis.activities.BookingActiveRequest;
import com.didaku.timeaxis.activities.BookingTransaction;
import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.didaku.timeaxis.base.interfaces.ITransaction;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class GuiceModule implements Module
{
	@Override
	public void configure(final Binder binder)
	{
		binder.bind(IActiveRequest.class).annotatedWith(Names.named("Booking")).to(BookingActiveRequest.class);
		binder.bind(ITransaction.class).annotatedWith(Names.named("Booking")).to(BookingTransaction.class);
	}
}
