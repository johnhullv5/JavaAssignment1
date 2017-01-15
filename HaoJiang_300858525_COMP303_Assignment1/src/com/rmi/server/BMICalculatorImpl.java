package com.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.demo.BMICalculator;

public class BMICalculatorImpl extends UnicastRemoteObject implements BMICalculator {

	protected BMICalculatorImpl() throws RemoteException {
		super();
	}

	@Override
	public Double calculateBMI(Double height, Double weight) {
		try {
			return (height / (weight * weight));
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
//			switch(){
//			case 1.0:
//				break;
//			default:
//				break;
//			
//			}
				
			return null;		
			
		}
		else
		{
			return null;
		}
		
	}

}
