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

public class BMIModel {

	private Double height;

	private Double weight;

	private Double[] others;

	public BMIModel(Double height, Double weight, Double... others) {
		this.height = height;

		this.weight = weight;

		this.others = others;

	}

	public Double getHeight() {
		return this.height;
	}

	public Double getWeight() {
		return this.weight;
	}

	public Double getSomething(int idx) {
		try {
			return this.others[idx];
		} catch (Exception e) {
			return null;
		}

	}

}
