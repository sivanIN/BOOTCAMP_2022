package day2;

public class Mobile {
	
	private String brand;
	private String model;
	private int ram;
	private String camera;
	private  float screenSize;
	
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(String brand) {
		this.brand = brand;
	}
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected int getRam() {
		return ram;
	}
	protected void setRam(int ram) {
		this.ram = ram;
	}
	protected String getCamera() {
		return camera;
	}
	protected void setCamera(String camera) {
		this.camera = camera;
	}
	protected float getScreenSize() {
		return screenSize;
	}
	protected void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", ram=" + ram + ", camera=" + camera + ", screenSize="
				+ screenSize + "]";
	}
	public Mobile(String brand, String model, int ram, String camera, float screenSize) {
		
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.camera = camera;
		this.screenSize = screenSize;
	}
	
	

}
