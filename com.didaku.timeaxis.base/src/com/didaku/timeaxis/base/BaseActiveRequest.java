package com.didaku.timeaxis.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.google.common.collect.Maps;

public class BaseActiveRequest implements Map<String, String>, IActiveRequest
{
	private final HashMap<String, String> _Map = Maps.newHashMap();

	@Override
	public int size()
	{
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean containsKey(final Object key)
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean containsValue(final Object value)
	{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String get(final Object key)
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String put(final String key, final String value)
	{
		return _Map.put(key, value);
	}

	@Override
	public String remove(final Object key)
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void putAll(final Map<? extends String, ? extends String> m)
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public void clear()
	{
		// TODO 自动生成的方法存根

	}

	@Override
	public Set<String> keySet()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Collection<String> values()
	{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet()
	{
		// TODO 自动生成的方法存根
		return null;
	}

}
