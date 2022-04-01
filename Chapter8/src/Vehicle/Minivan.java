package Vehicle;

public class Minivan extends Vehicle {

	public Minivan(int r, double ws, String e, double ns) {
		super(r, ws, e, ns);
		
	}

	
	public int numSeats() {
		int numS= 7;
		return(numS);
	}
	
	public String description() {
		String de = " Great for large families and long roadtrips";
		return(de);
	}

	
}
