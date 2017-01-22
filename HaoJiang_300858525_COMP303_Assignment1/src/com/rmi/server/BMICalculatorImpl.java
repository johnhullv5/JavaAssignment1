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

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.demo.BMICalculator;
import com.rmi.demo.BMIModel;

public class BMICalculatorImpl extends UnicastRemoteObject implements BMICalculator {

	public BMICalculatorImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 *  One of calculation method of BMI.
	 * @param height
	 *            a Person's height
	 * 
	 * @param weight
	 *            a Person's height
	 * 
	 * @return BMI index: Double
	 * 
	 */
	@Override
	public Double calculateBMI(Double height, Double weight) {
		try {
			return (weight / (height * height));
		} catch (Exception e) {
			System.out.println("something nasty happened.");
			return null;

		}

	}

	/**
	 * 
	 *  One of categorized method.
	 * @param height
	 *            a Person's height
	 * 
	 * @param weight
	 *            a Person's height
	 * 
	 * @return BMI category: String
	 * 
	 */
	@Override
	public String getCategory(Double height, Double weight) {
		Double result = calculateBMI(height, weight);
		if (result != null) {
			if (result.doubleValue() >= 25.0) {
				return "Overweight";
			}
			if ((result.doubleValue() >= 18.5) && (result.doubleValue() < 25.0)) {
				return "Normal";
			}
			if ((result.doubleValue() > 0.0) && (result.doubleValue() < 18.5)) {
				return "Underweight";
			}

			return null;

		} else {
			return null;
		}

	}
	
	/**
	 * 
	 *  One of categorized method in HongKong.
	 *  https://en.wikipedia.org/wiki/Body_mass_index
	 * @param height
	 *            a Person's height
	 * 
	 * @param weight
	 *            a Person's height
	 * 
	 * @return BMI category: String
	 * 
	 */
	@Override
	public String getCategoryByHK(Double height, Double weight) {
		Double result = calculateBMI(height, weight);
		if (result != null) {
			if (result.doubleValue() >= 30.0) {
				return "Overweight—Severely Obese";
			}
			if ((result.doubleValue() >= 25.0) && (result.doubleValue() < 30.0)) {
				return "Overweight—Moderately Obese";
			}
			if ((result.doubleValue() >= 23.0) && (result.doubleValue() < 25.0)) {
				return "Overweight—At Risk";
			}
			if ((result.doubleValue() >= 18.5) && (result.doubleValue() < 23.0)) {
				return "Normal";
			}
			if ((result.doubleValue() > 0.0) && (result.doubleValue() < 18.5)) {
				return "Underweight";
			}

			return null;

		} else {
			return null;
		}

	}
	

	/**
	 * maybe a new calculation method.
	 */
	@Override
	public Double calculateBMIModel(BMIModel model) throws RemoteException {
		return null;
	}

	@Override
	public String getCategoryByModel(BMIModel model) throws RemoteException {
		return null;
	}

}
