package com.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.demo.*;
import com.rmi.demo.BMICalculator;
import com.rmi.demo.BMIConstant;

public class BMIClient {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", BMIConstant.RPORT);
			BMICalculator h = (BMICalculator) registry.lookup(BMIConstant.RID);
		} catch (Exception e) {
			System.out.println("BMI client exception: " + e);
		}
	}
}

