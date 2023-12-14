package com.tnsif.staticVariableDemo;

public class Car {

	private String carOwner;
	private int carNo;
	
	static String carName = "oddy";  //declare static variable

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Car.carName = carName;
	}

	public Car(String carOwner, int carNo) {
		super();
		this.carOwner = carOwner;
		this.carNo = carNo;
	}

	@Override
	public String toString() {
		return "Car [carOwner=" + carOwner + ", carNo=" + carNo + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	}


