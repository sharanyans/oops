package oops;

class Bicycle  extends Vehicle{
	private int numGears;
	
	public Bicycle(String brand,String color, int numGears) {
		super(brand, color);
		this.numGears=numGears;
	}
	@Override
	public void drive() {
		System.out.println("Riding the bicycle");
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("NUMBER OF GEARS"+numGears);
	}

}
