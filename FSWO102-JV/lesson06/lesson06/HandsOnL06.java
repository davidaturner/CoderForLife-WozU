package lesson06;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.CharBuffer;

public class HandsOnL06 {

	public static void main(String[] args) {
		// array
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		
		printSongs(songs);
		
		performFileIO ( createSongList(songs));

	}
	
	public static void printSongs(String [] songs) {
		System.out.println("Songs[]:");
		for(String song : songs) {
			System.out.println("   " + song);
		}
	}
	public static String createSongList(String [] songs) {
		
		System.out.println("Step 1: Converting songs[] array into song list (String).");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<songs.length; i++) {
			if (i == songs.length-1) {
				sb.append(songs[i]);
			} else {
				sb.append(songs[i] + ", ");
			}
		}
		System.out.println("From songs(): ");
		System.out.println("   " + sb.toString());
		return sb.toString();
	}
	
	public static void performFileIO(String str) {
			
		FileReader reader;
		FileWriter writer;
		String fileContentsRead = "";

		try{
			System.out.println("Step 2: Save song list to songs.txt.");			
		    writer = new FileWriter("songs.txt");
		    writer.write(str);
		    writer.close();
		    
			System.out.println("Step 3: Verify safe save by reading songs.txt.");
		    reader = new FileReader("songs.txt");
		    
		    int c;
		    while ((c = reader.read()) != -1) {
		    	char converted = (char)c;
		        fileContentsRead = fileContentsRead + converted;
		    }
		    System.out.println("From songs.txt: ");
		    System.out.println("   " + fileContentsRead);
		}

		catch(Exception e){
			System.out.println("Error when writing songs.txt.");
		    e.printStackTrace();
		}

	}

}
