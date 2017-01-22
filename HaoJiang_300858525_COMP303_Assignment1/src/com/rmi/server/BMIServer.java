/*
 * Copyright 2017 (C) <Centennial College> COMP303-assign1
 * 
 * Created on : 21-01-2017
 * Author     : Hao Jiang (300858525)
 *
 *-----------------------------------------------------------------------------
 * Revision History (Release 1.0.0.0)
 *-----------------------------------------------------------------------------
 */
package com.rmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.demo.BMIConstant;

public class BMIServer {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		try {
			BMICalculatorImpl h = new BMICalculatorImpl();
			Registry registry = LocateRegistry.createRegistry(BMIConstant.RPORT);
			registry.bind(BMIConstant.RID, h);
			System.out.println("BMI calculator server started");
		} catch (Exception e) {
			System.out.println("BMI calculator server failed: " + e);
		}
	}

}
