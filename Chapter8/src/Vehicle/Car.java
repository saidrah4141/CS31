package Vehicle;

public class Car extends Vehicle {

	

	public Car(int r, double ws, String e, double ns) {
		super(r, ws, e, ns);
		
	}

	public int numSeats() {
		int numS= 5;
		return(numS);
	}
	
	public String description() {
		String de = " Great on fuel and perfect for small families.";
		return(de);
	}

	
	
}
