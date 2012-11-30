package com.didaku.common.interfaces;

public interface IEntity
{
	/**
	 * 获取实体的ID
	 * 
	 * @return 记录的ID
	 */
	public String getId();

	/**
	 * 设置实体的ID
	 * 
	 * @param id
	 *            记录的ID
	 */
	public void setId(final String id);

	/**
	 * 获取实体的一些详述
	 * 
	 * @return 实体的一些详述
	 */
	public String getDetail();

	/**
	 * 设置实体的一些详述
	 * 
	 * @param detail
	 *            实体的一些详述
	 */
	public void setDetail(final String detail);

}
