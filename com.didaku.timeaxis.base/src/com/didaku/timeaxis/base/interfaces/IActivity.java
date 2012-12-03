package com.didaku.timeaxis.base.interfaces;

import com.didaku.common.interfaces.IEntity;

/**
 * 描述工作流水线上的每个动作的接口
 * 
 * @author lukan@jeelu.com
 */
public interface IActivity extends IEntity
{
	/**
	 * 执行动作
	 * 
	 * @param params
	 *            动作的输入参数。可通过{@code findParam()}得到输入参数的实例，但需要将实例中的详细数据进行赋值
	 * @param transaction
	 *            动作的输出记录。可通过{@code buildTransaction()}得到输出记录的初始实例，如果动作执行成功，该记录实例的各属性将被赋值。
	 * @return 执行动作是否成功
	 */
	boolean execute(IActiveParams params, ITransaction transaction);

	IActiveParams findParam();

	ITransaction buildTransaction();
}
