package com.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.demo.BMICalculator;
import com.rmi.demo.BMIModel;

public class BMICalculatorImpl extends UnicastRemoteObject implements BMICalculator {

	protected BMICalculatorImpl() throws RemoteException {
		super();
	}

	@Override
	public Double calculateBMI(Double height, Double weight) {
		try {
			return (weight / (height * height));
		} catch (Exception e) {
			System.out.println("something nasty happened.");
			return null;

		}

	}

	@Override
	public String getCategory(Double height, Double weight) {
		Double result = calculateBMI(height, weight);
		if(result!=null)
		{
			if(result.doubleValue()>=25.0)
			{
				return "Overweight";
			}
			if((result.doubleValue()>=18.5) &&(result.doubleValue()<25.0))
			{
				return "Normal";
			}
			if((result.doubleValue()>0.0) &&(result.doubleValue()<18.5))
			{
				return "Underweight";
			}
				
			return null;		
			
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public Double calculateBMIModel(BMIModel model) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategoryByModel(BMIModel model) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
