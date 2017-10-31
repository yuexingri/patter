package com.patter.observer;

/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {
	/**
	 * 观察者更新数据
	 * @param temp
	 * @param homidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure);
}
