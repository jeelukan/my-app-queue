package com.didaku.timeaxis.base.interfaces;

/**
 * 描述一条记录的接口。记录：事件发生的信息。它有几个特性：1发生了就不可更改，2量相对较大。
 * 
 * @author Administrator
 * 
 */
public interface IRecord
{
	/**
	 * 获取记录的ID
	 * 
	 * @return 记录的ID
	 */
	public String getId();

	/**
	 * 设置记录的ID
	 * 
	 * @param id
	 *            记录的ID
	 */
	public void setId(final String id);

}
