package com.didaku.common.interfaces;

import java.util.Date;

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

	/**
	 * 获取实体是否已经被删除(打上了删除标记)
	 * 
	 * @return 实体是否已经被删除(打上了删除标记)
	 */
	public boolean getIsDeleted();

	/**
	 * 设置实体是否已经被删除(打上了删除标记)
	 * 
	 * @param isDeleted
	 *            实体是否已经被删除(打上了删除标记)
	 */
	public void setIsDeleted(boolean isDeleted);

	/**
	 * 获取实体的创建者的ID
	 * 
	 * @return 实体实体的创建者的ID
	 */
	public String getCreator();

	/**
	 * 设置实体的创建者的ID
	 * 
	 * @param creator
	 *            实体的创建者的ID
	 */
	public void setCreator(final String creator);

	/**
	 * 获取实体的创建时间
	 * 
	 * @return 实体的创建时间
	 */
	public String getCreatedTime();

	/**
	 * 设置实体的创建时间
	 * 
	 * @param createdTime
	 *            实体的创建时间
	 */
	public void setCreatedTime(final String createdTime);

	/**
	 * 获取实体的编辑者ID
	 * 
	 * @return 实体的编辑者ID
	 */
	public String getEditor();

	/**
	 * 设置实体的编辑者ID
	 * 
	 * @param editor
	 *            实体的编辑者ID
	 */
	public void setEditor(final String editor);

	/**
	 * 获取实体的编辑(修改)时间
	 * 
	 * @return 实体的编辑(修改)时间
	 */
	public Date getEditedTime();

	/**
	 * 设置实体的编辑(修改)时间
	 * 
	 * @param editTime
	 *            实体的编辑(修改)时间
	 */
	public void setEditedTime(final Date editedTime);

}
