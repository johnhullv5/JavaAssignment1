package com.rmi.demo;

import java.rmi.*;

public interface Hello extends Remote {
	
	public String say() throws RemoteException;
}

