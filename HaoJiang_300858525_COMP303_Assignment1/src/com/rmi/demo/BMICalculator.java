package com.rmi.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMICalculator extends Remote {

	public Double calculateBMI(Double height, Double weight) throws RemoteException;
	
	public Double calculateBMIModel(BMIModel model) throws RemoteException;

	public String getCategory(Double height, Double weight) throws RemoteException;
	
	public String getCategoryByModel(BMIModel model) throws RemoteException;

}
