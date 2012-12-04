package com.didaku.timeaxis.environment.storage;

import com.didaku.common.interfaces.IEntity;
import com.didaku.common.interfaces.IRecord;
import com.didaku.orm.interfaces.IStorage;

public class Storages
{
	public static <T extends IRecord> IStorage<T> getRecordStorage(final Class<T> recordClass)
	{
		return null;
	}

	public static <T extends IEntity> IStorage<T> getEntityStorage(final Class<T> entityClass)
	{
		return null;
	}
}
