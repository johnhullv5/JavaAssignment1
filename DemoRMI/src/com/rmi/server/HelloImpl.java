package com.rmi.server;

import java.rmi.*;
import java.rmi.server.*;
import com.rmi.demo.Hello;

public class HelloImpl extends UnicastRemoteObject implements Hello {
	public String message;

	public HelloImpl(String msg) throws RemoteException {
		message = msg;
	}

	public String say() throws RemoteException {
		return message;
	}
}