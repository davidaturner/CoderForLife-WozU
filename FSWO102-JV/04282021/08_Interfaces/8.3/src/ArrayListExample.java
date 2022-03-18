import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		statesOfMatterA();
		statesOfMatterB();
		statesOfMatterC();
	}
	
	public static void statesOfMatterA() {
		List<String> statesOfMatter = new ArrayList<String>();
		statesOfMatter.add("Solid");
		statesOfMatter.add("Liquid");
		statesOfMatter.add("Gas");
		System.out.println(statesOfMatter);
	}
	
	public static void statesOfMatterB() {
		List<String> statesOfMatter = new ArrayList<String>();
		statesOfMatter.add("Solid");
		statesOfMatter.add("Liquid");
		statesOfMatter.add("Gas");
		System.out.println(statesOfMatter.size());
	}
	
	public static void statesOfMatterC() {
		List<String> statesOfMatter = new ArrayList<String>();
		statesOfMatter.add("Solid");
		statesOfMatter.add("Liquid");
		statesOfMatter.add("Gas");

		// print the values in the ArrayList
		for(int i = 0; i < statesOfMatter.size(); i++){
		    System.out.println(statesOfMatter.get(i));
		}
	}

}
