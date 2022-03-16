package Puck;

public class Hockey extends PuckPart1 {

	public static void main(String[] args) {
		PuckPart1 puck1 = new PuckPart1();
		PuckPart1 puck2 = new PuckPart1();
	
		puck1.puck(5.3);
		puck2.puck(4.3);

		if (puck1.equals(puck2)) {
			System.out.print("pucks are equal");
		} else {
			System.out.print("pucks are not equal");
		}
	}

	

}
