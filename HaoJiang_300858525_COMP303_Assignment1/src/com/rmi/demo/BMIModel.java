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

	public Double getSomething(int idx)
	{
		try
		{
			return this.others[idx];
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

}
