package com.dp.model;

public class Laptop {
	private int laptopId;
	private String modelName;
	private String model;
	private float cost;
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int laptopId, String modelName, String model, float cost) {
		super();
		this.laptopId = laptopId;
		this.modelName = modelName;
		this.model = model;
		this.cost = cost;
	}

	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
