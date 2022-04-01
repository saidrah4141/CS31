package Vehicle;

public class Truck extends Vehicle {

	public Truck(int r, double ws, String e, double ns) {
		super(r, ws, e, ns);
		
	}

		
		public int numSeats() {
			int numS= 5;
			return(numS);
		}
		
		public String description() {
			String de = "Great for hauling payload and going off-road.";
			return(de);
		}

	
	
	
	}
