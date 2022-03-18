import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOEx2 {

	public static void main(String[] args) {
		
//		BufferedReader is a class that makes reading and writing files more efficient. 
//		FileReader is a powerful tool on its own. However, each time a character is being 
//		read from a file, the operating system needs to wait for other programs to finish 
//		performing operations on the disk, and then retrieve the single character from the 
//		file. I/O requests take quite a long time compared to memory (RAM) and CPU time. 
//		BufferedReader makes the trip to the hard disk worthwhile and efficient by grabbing 
//		more data (e.g., a full line of text) for every trip. The same is true of 
//		BufferedWriter being a more efficient alternative to writing to a file than FileReader. 
		
		// define the variables and objects
		BufferedReader reader;
		FileWriter writer;
		String fileContentsRead = "";

		// attempt to run code that may cause an error
		try{
		    // open the file for writing
		    writer = new FileWriter("story.txt");
		    // write the letter "a" inside of the file
		    writer.write("a");
		    // close the file (finished writing)
		    writer.close();

		    // open the file for reading
		    reader = new BufferedReader(new FileReader("story.txt"));
		    String line;
		    while ((line = reader.readLine()) != null) {
		        fileContentsRead = fileContentsRead + line;
		    }
		    // close the file (finished reading)
		    reader.close();
		}
		// catch errors that happened in the try block
		catch(Exception e){
		    // print the stack trace (error)
		    e.printStackTrace();
		}
		finally{
		    System.out.println(fileContentsRead);
		}
	}

}
