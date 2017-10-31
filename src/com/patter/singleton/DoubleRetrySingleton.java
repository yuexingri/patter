package com.patter.singleton;

/**
 * 双端检索
 * @author Administrator
 *
 */
public class DoubleRetrySingleton {
	private static volatile DoubleRetrySingleton doubleRetrySingleton;
	private DoubleRetrySingleton() {}
	
	public static DoubleRetrySingleton getInstance(){
		if(doubleRetrySingleton == null){
			synchronized(DoubleRetrySingleton.class){
				if(doubleRetrySingleton == null){
					doubleRetrySingleton = new DoubleRetrySingleton();
				}
			}
		}
		return doubleRetrySingleton;
	}
}
