package com.patter.proxy;

import java.rmi.Naming;

public class ServiceMain {

	public static void main(String[] args) {
		try {
			IGumballService service = new GumballServiceImpl();
			Naming.bind("gumballService", service);
			System.out.println("启动成功");
		} catch (Exception e) {
			System.out.println("服务启动异常");
		}
	}

}
