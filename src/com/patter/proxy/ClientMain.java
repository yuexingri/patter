package com.patter.proxy;

import java.rmi.Naming;
import java.rmi.Remote;

public class ClientMain {

	public static void main(String[] args) {
		try {
			GumballServiceImpl service = (GumballServiceImpl) Naming.lookup("rmi://127.0.0.1/gumballService");
			String str = service.sayHello();
			System.out.println(str);
		} catch (Exception e) {
		}
	}

}
