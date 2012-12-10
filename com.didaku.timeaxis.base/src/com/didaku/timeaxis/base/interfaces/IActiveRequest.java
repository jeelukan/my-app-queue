package com.didaku.timeaxis.base.interfaces;

public interface IActiveRequest
{
	String put(final String key, final String value);

	String get(final String key);
}
