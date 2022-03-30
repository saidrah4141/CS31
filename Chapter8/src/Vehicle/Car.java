package Vehicle;

public class Car extends Vehicle {

	

	public Car(int r, double ws, String e, double ns) {
		super(r, ws, e, ns);
		
	}

	public String capacityWeight() {
		String cw =" Comes with 5 seats and weighs 3000 pounds.";
		return(cw);
	}
	
	public String description() {
		System.out.print(" Comes with 5 seats and weighs 3000 pounds.");
	}

	
	
}
