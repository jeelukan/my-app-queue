package com.didaku.timeaxis.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.didaku.timeaxis.base.interfaces.IActiveRequest;
import com.google.common.collect.Maps;

public abstract class BaseActiveRequest implements Map<String, String>, IActiveRequest
{
	private final HashMap<String, String> _Map = Maps.newHashMap();

	@Override
	public int size()
	{
		return _Map.size();
	}

	@Override
	public boolean isEmpty()
	{
		return _Map.isEmpty();
	}

	@Override
	public boolean containsKey(final Object key)
	{
		return _Map.containsKey(key);
	}

	@Override
	public boolean containsValue(final Object value)
	{
		return _Map.containsValue(value);
	}

	@Override
	public String get(final String key)
	{
		return _Map.get(key);
	}

	@Override
	public String get(final Object key)
	{
		return _Map.get(key);
	}

	@Override
	public String put(final String key, final String value)
	{
		return _Map.put(key, value);
	}

	@Override
	public String remove(final Object key)
	{
		return _Map.remove(key);
	}

	@Override
	public void putAll(final Map<? extends String, ? extends String> m)
	{
		_Map.putAll(m);
	}

	@Override
	public void clear()
	{
		_Map.clear();
	}

	@Override
	public Set<String> keySet()
	{
		return _Map.keySet();
	}

	@Override
	public Collection<String> values()
	{
		return _Map.values();
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet()
	{
		return _Map.entrySet();
	}

	@Override
	public String toString()
	{
		return this.getClass().getName();
	}
}
