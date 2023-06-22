package oops;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Vehicle v1=new Bicycle("Brand1","red",1);
		Vehicle v2=new Car("Brand2","green",4);
		Vehicle v3=new Bus("Brand3","yellow",30);
		
		List<Vehicle> vehicle=new ArrayList<>();
		vehicle.add(v1);
		vehicle.add(v2);
		vehicle.add(v3);
		
		
		for(Vehicle vehicle1:vehicle) {
			 vehicle1.drive();
			 vehicle1.printDetails();
			 System.out.println();
		}
		
		

	}

}
