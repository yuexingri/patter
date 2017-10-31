package com.patter.singleton;

/**
 * 饿汉式
 * @author Administrator
 *
 */
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
