package oops;

class Vehicle {
	protected String brand;
	protected String color;
	public Vehicle (String brand,String color) {
		this.brand=brand;
		this.color=color;
		
	}
	public void drive() {
		System.out.println("Driving the vehicle");
	}
	public void printDetails() {
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
	}

}
