import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {

//		A dictionary, also called a hash table, functions like a dictionary in the real 
//		world. Each word acts as the key which is associated with the definition, or 
//		the value. In Java, the key and value of a dictionary can be any data type, not 
//		just a String as seen in real world dictionaries. A dictionary for the English 
//		language would consist of a key of type String and a value of type String. If this 
//		were written in code, it would resemble the following code block.
		
		Hashtable<String, String> englishDictionary = new Hashtable<String, String>();
		englishDictionary.put("persist", "to go on resolutely or stubbornly in spite of opposition, importunity, or warning");

		// get the value associated with the "persist" key
		String definition = englishDictionary.get("persist");
		// if the key exists, print the value
		if (definition != null) {
		    System.out.println("<Key> persist : <Value> " + definition);
		}
	}

}
