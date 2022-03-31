package Vehicle;

 abstract class Vehicle {
	private int range;
	private double weight;
	private String engine;
	private double make;
	


 public Vehicle (int r, double ws, String e, double ns) {
	 range= r;
	 weight= ws;
	 make= ns;
	 engine= e;
	 
 }
 
 public int getRange() {
	 return(range);
 }
 
 
 public double getMake() {
	 return(make);
 }
 
 
 public String getEngine() {
	 return(engine);
 }

 public double getWeight() {
	 return(weight);
 }
 
 
 
 abstract int numSeats();

 
 
 abstract String description();
 
 
 }