
public class Search {

	public static int linear(int[] array, int numToFind) {
		int index = 0;
		
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}
		
		if (array[index] == numToFind) {
			return(index);
		} else {
			return(-1);
		}
	}

	/*
	 Searchs an array to find the position of a specific String
	 pre:none
	 post: returns either -1 or the index of the chosen String
	 */
	
	public static int linear(String[] array, String nameToFind) {
		int index = 0;
		
		while ((! array[index].equals(nameToFind)) && (index < array.length - 1)) {
			index += 1;
		}
		
		if (array[index].equals(nameToFind)) {
			return(index);
		} else {
			return(-1);
		}
	}
		
	}
	
	
	
	
	
	


