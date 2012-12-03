package com.didaku.timeaxis.repository;

import java.lang.reflect.Type;
import java.util.HashMap;

import com.didaku.timeaxis.base.interfaces.IBooking;
import com.didaku.timeaxis.entities.Booking;
import com.google.common.collect.Lists;
import com.google.common.reflect.ImmutableTypeToInstanceMap;
import com.google.common.reflect.TypeToken;

public class BookingMap extends HashMap<String, Type>
{
	private static final long serialVersionUID = 6121697768734814860L;

	public void a()
	{
		ImmutableTypeToInstanceMap<IBooking> bookingMap =
			       ImmutableTypeToInstanceMap.<IBooking>builder()
			           .put(new TypeToken<IBooking>() {}, new Booking())
			           .put(new TypeToken<IBooking>() {}, new Booking())
			           .build();
		bookingMap.clear();
		
		Lists.newArrayList();
	}
}
