package Vehicle;

 abstract class Vehicle {
	private int range;
	private double weight;
	private String engine;
	private double numSeat;
	


 public Vehicle (int r, double ws, String e, double ns) {
	 range= r;
	 weight= ws;
	 numSeat= ns;
	 engine= e;
	 
 }
 
 public int getRange() {
	 return(range);
 }
 
 
 public double getSeats() {
	 return(numSeat);
 }
 
 
 public String getEngine() {
	 return(engine);
 }

 public double getWeight() {
	 return(weight);
 }
 
 
 
 abstract String capacityWeight();

 
 
 abstract String description();
 
 
 }