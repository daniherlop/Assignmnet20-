package PartA;

public class Computer {

	private static int numOfComp = 0;
	private static long serialnumCounter = 1000000;

	private String brand;
	private String model;
	private long serialnum;
	private double price;
	
	public Computer(String brand, String model, long serialnum, double price) {
		this.brand = brand;
		this.model = model;
		this.serialnum = serialnumCounter;
		this.serialnumCounter++;
		numOfComp++;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(long serialnum) {
		this.serialnum = serialnum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int findNumberOfCreatedComputers() {
		return numOfComp;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", serialnum=" + serialnum + ", price=" + price + "]";
	}

	public boolean equals(Computer c) {
		if (brand == c.brand && model == c.model && price == c.price) {
			return true;
		}else {
			return false;
		}
	}

}
