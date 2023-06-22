package oops;

 class Car extends Vehicle {
private int numDoors;
	
	public Car(String brand,String color, int numDoors) {
		super(brand, color);
		this.numDoors=numDoors;
	}
	@Override
	public void drive() {
		System.out.println("Riding the car");
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("NUMBER OF Doors"+numDoors);
	}

}
