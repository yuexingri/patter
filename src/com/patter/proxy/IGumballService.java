package com.patter.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGumballService extends Remote {
	public String sayHello() throws RemoteException;
}
