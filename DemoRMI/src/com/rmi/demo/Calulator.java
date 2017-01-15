package com.rmi.demo;

import java.rmi.*;

public interface Calulator extends Remote {

	public double add(double a, double b) throws RemoteException;

	public double substract(double a, double b) throws RemoteException;

	public double multiply(double a, double b) throws RemoteException;

	public double divide(double a, double b) throws RemoteException;

}
