package com.patter.singleton;

/**
 * 懒汉式
 * @author Administrator
 *
 */
public class SlackerSingleton {
	private static SlackerSingleton slackerSingleton;
	private SlackerSingleton() {}
	
	public static SlackerSingleton getInstance(){
		if(slackerSingleton == null){
			slackerSingleton = new SlackerSingleton();
		}
		return slackerSingleton;
	}
}
