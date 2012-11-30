package com.didaku.common.interfaces;

/**
 * 描述一个可初始化的接口
 * 
 * @author lukan@jeelu.com
 * 
 */
public interface IInitializer
{
	/**
	 * 是否已经初始化
	 * 
	 * @return 是否已经初始化
	 */
	boolean IsInitialized();

	/**
	 * 执行初始化动作
	 * 
	 * @param args
	 *            初始化时的动作参数
	 * @return 初始化是否成功
	 */
	boolean Initialize(Object[] args);
}
