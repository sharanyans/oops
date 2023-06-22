package oops;

 class Bus extends Vehicle {
	 private int seatingCapacity;
		
		public Bus(String brand,String color, int seatingCapacity) {
			super(brand, color);
			this.seatingCapacity=seatingCapacity;
		}
		@Override
		public void drive() {
			System.out.println("Driving bus");
		}
		
		@Override
		public void printDetails() {
			super.printDetails();
			System.out.println("NUMBER OF GEARS"+seatingCapacity);
		}

}
