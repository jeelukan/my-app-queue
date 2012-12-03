package com.didaku.timeaxis.environment.storage;

import com.didaku.common.interfaces.IRecord;
import com.didaku.orm.interfaces.IStorage;

public class Storages
{
	public static <T extends IRecord> IStorage<T> getStorage(final Class<T> recordClass)
	{
		return null;
	}
}
