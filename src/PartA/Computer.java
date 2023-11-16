package PartA;

public class Computer {

	private static int numofcompu = 0;

	private String brand;
	private String model;
	private long serialnum;
	private double price;
	
	public Computer(String brand, String model, long serialnum, double price) {
		this.brand = brand;
		this.model = model;
		this.serialnum = serialnum;
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

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", serialnum=" + serialnum + ", price=" + price + "]";
	}

	

}
