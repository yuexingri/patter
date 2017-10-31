package com.patter.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballServiceImpl extends UnicastRemoteObject implements IGumballService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5804008515278537945L;

	protected GumballServiceImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "hello ";
	}

}
