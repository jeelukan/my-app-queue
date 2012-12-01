package com.didaku.timeaxis.base.interfaces;

import com.didaku.common.interfaces.IRecord;

public interface IComment extends IRecord
{
	String getUserId();

	void setUserId(String userId);

	String getTransactionId();

	void setTransactionId(String transactionId);

	String getText();

	void setText(String text);

	short getLevel();

	void setLevel(short Level);
}
