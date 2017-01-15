package com.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.demo.Calulator;
import com.rmi.demo.Hello;
import com.rmi.demo.RMIConstant;

public class HelloClient {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		try {
			// Registry registry = LocateRegistry.getRegistry("localhost",
			// RMIConstant.RPORT);
			Registry registry = LocateRegistry.getRegistry("localhost", RMIConstant.CPORT);
			// Hello h = (Hello) registry.lookup(RMIConstant.CID);
			Calulator h = (Calulator) registry.lookup(RMIConstant.CID);
			System.out.println(h.add(1, 2));
			System.out.println(h.divide(1, 2));
			System.out.println(h.substract(1, 2));
			System.out.println(h.multiply(1, 2));
			System.out.println(h.divide(1, 0));

		} catch (Exception e) {
			System.out.println("Hello client exception: " + e);
		}
	}
}
