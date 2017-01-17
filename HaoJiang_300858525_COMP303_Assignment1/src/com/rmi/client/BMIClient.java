package com.rmi.client;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

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
			String height= JOptionPane.showInputDialog("Please input your height(m): ");
			String weight= JOptionPane.showInputDialog("Please input mark weight(kg): ");
			Double height_d = Double.parseDouble(height);
			Double weight_d = Double.parseDouble(weight);
			
			Registry registry = LocateRegistry.getRegistry("localhost", BMIConstant.RPORT);
			BMICalculator h = (BMICalculator) registry.lookup(BMIConstant.RID);
			
			JOptionPane.showMessageDialog(null,
				    "Your BMI: "+h.calculateBMI(height_d, weight_d).toString());
			
			System.out.println("BMI: "+h.calculateBMI(height_d, weight_d));
			
		} catch (Exception e) {
			System.out.println("BMI client exception: " + e);
		}
	}
}

