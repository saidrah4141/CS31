

package Puck;

public class Hockey extends Puck {

	public static void main(String[] args) {
		Puck puck1 = new Puck();
		Puck puck2 = new Puck();
	
		puck1.puck(5.3);
		puck2.puck(4.3);

		if (puck1.equals(puck2)) {
			System.out.print("pucks are equal");
		} else {
			System.out.print("pucks are not equal");
		}
	}

	

}
