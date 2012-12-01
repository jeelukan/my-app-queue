package com.didaku.timeaxis.base.interfaces;

import com.didaku.common.interfaces.IEntity;

public interface IActivity extends IEntity
{
	boolean Ask(IActiveParams param, ITransaction transaction);

	IActiveParams FindParam();
}
