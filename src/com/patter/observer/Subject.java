package com.patter.observer;

/**
 * 主题接口
 * @author Administrator
 *
 */
public interface Subject {
	/**
	 * 观察者注册
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	/**
	 * 观察者取消关注
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	/**
	 * 数据更新，通知观察者
	 */
	public void notifyObservers();
}
