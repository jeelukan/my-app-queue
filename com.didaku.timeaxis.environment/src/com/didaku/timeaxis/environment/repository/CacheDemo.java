package com.didaku.timeaxis.environment.repository;

import java.util.List;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class CacheDemo
{
	public CacheDemo()
	{
		CacheManager manager = new CacheManager("z:\\ehcache.xml");
		net.sf.ehcache.Cache cache = manager.getCache("BrandKeywordMonitorCache");

		for (int i = 0; i < 5; i++)
		{
			Element e = new Element("key" + i, "value" + i);
			cache.put(e);
		}
		List<String> keys = cache.getKeys();
		for (String key : keys)
			System.out.println(key + "," + cache.get(key));
	}

	public static void main(final String[] args)
	{
		CacheDemo demo = new CacheDemo();
		demo.toString();
	}
}
