package Vehicle;

 abstract class Vehicle {
	private int range;
	private String color;
	private String engine;
	private boolean tint;
	


 public Vehicle (int r, String c, String e, boolean t) {
	 range= r;
	 color = c;
	 engine= e;
	 tint= t;
 }
 
 public int getRange() {
	 return(range);
 }
 
 
 public String getColor() {
	 return(color);
 }
 
 
 public String getEngine() {
	 return(engine);
 }

 
 public boolean getTint() {
	 return(tint);
 }
 
 
 
 }