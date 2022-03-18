
public class StringBuilderEx1 {

	public static void main(String[] args) {
	    String finalString = "";
	    String cities[] = {"Tokyo", "Delhi", "Shanghai", "Mexico City", "São Paulo"};
	    // loop through all of the cities
	    for(int i = 0; i < cities.length; i++){
	        // concatenate the city names with a comma in between each city name
	    	finalString = finalString + cities[i];
	        if (i < cities.length-1)  {
		        finalString += ", ";
	        }
	    }
	    System.out.println(finalString);
	}

}
