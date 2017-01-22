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
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.text.DecimalFormat;

import org.junit.Before;

import com.rmi.server.BMICalculatorImpl;

//test BMICalculationImpl logic.
public class TestBMICalculationImpl {

	private static DecimalFormat df2 = new DecimalFormat(".##");

	@Before
	public void setUp() throws Exception {

	}

	//test BMI calculation.
	@org.junit.Test
	public void testBMI() throws RemoteException {
		BMICalculatorImpl h = new BMICalculatorImpl();
		String actual = df2.format(h.calculateBMI(1.62, 60.0).doubleValue());
		String expected = "22.86";
		assertEquals(expected, actual);
	}
	
	//test BMI categories.
	@org.junit.Test
	public void testBMICategory() throws RemoteException {
		BMICalculatorImpl h = new BMICalculatorImpl();
		String actual = h.getCategory(1.62, 60.0);
		String expected = "Normal";
		assertEquals(expected, actual);
	}
	
	//test BMI HK categories.
	@org.junit.Test
	public void testBMICategoryHK() throws RemoteException {
		BMICalculatorImpl h = new BMICalculatorImpl();
		String actual = h.getCategoryByHK(1.62, 90.0);
		String expected = "Overweight—Severely Obese";
		assertEquals(expected, actual);
	}

}
