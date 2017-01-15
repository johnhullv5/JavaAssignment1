package com.rmi.server;

import java.rmi.*;
import java.rmi.server.*;
import com.rmi.demo.Calulator;

public class CalculatorImpl extends UnicastRemoteObject implements Calulator {
	protected CalculatorImpl() throws RemoteException {
		super();
	}

	@Override
	public double add (double a, double b) throws RemoteException{
		return a + b;
	}

	@Override
	public double substract(double a, double b) {
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		try
		{
			return a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("should not divide 0.");
			return Double.NaN;
		}
		
		
	}

}
