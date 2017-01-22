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
package com.rmi.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMICalculator extends Remote {

	public Double calculateBMI(Double height, Double weight) throws RemoteException;

	public Double calculateBMIModel(BMIModel model) throws RemoteException;

	public String getCategory(Double height, Double weight) throws RemoteException;

	public String getCategoryByHK(Double height, Double weight) throws RemoteException;

	public String getCategoryByModel(BMIModel model) throws RemoteException;

}
