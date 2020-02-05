package com.davidaturner.l06;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static String songfile = "songs.txt";
	public static void main(String[] args) {
		// array
		final String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		
		// Step01
		StringBuilder sb = RunStep01(songs);
		println("My Songlist: ", sb.toString());
		println();
		
		// Step02
		RunStep02(sb.toString());
		
		// Step03
		String[] loadedSongs = RunStep03();
		println("Song", loadedSongs);

	}
	
	public static StringBuilder RunStep01(String[] songs) {
		return new StringBuilder(stringify(songs));
	}
	
	private static String stringify(String[] messages) {
		if (messages == null || messages.length == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(String message : messages) {
			sb.append(message + ",");
		}
		return sb.substring(0, sb.length()-1);		
	}	
	public static void RunStep02(String songsstr) {
		writeToFile(songsstr);
	}
	private static void writeToFile(String message) {
		if (message == null || message.isEmpty()) {
			System.out.println("No message to write to file");
			return;
		}
		try {
			FileWriter writer = new FileWriter(songfile);
			writer.write(message);
			writer.close();
						
		} catch (Exception e) {
			System.out.println("Unable to write to file " + songfile);
			e.getStackTrace();
		}		
	}
	
	public static String[] RunStep03() {
	    return readFromFile();
	}
	private static String[] readFromFile() {
		ArrayList<String> messages = new ArrayList<>();
		try {
			String fileContentsRead = "";
			FileReader reader = new FileReader(songfile);
		    // save each character as an integer (ASCII)
		    int c;
		    // while there are more characters to be read, store them
		    while ((c = reader.read()) != -1) {
		    	if (c == 44) {
		    		messages.add(fileContentsRead);
		    		fileContentsRead = "";
		    		c = reader.read(); // comma (CSV)
		    	}
		    	String converted = new Character((char) c).toString();
		        fileContentsRead = fileContentsRead + converted;
		    }
    		messages.add(fileContentsRead);
    		fileContentsRead = "";
		    
		    // close the file (finished reading)
		    reader.close();
		    		    
		} catch (Exception e) {
			System.out.println("Unable to write to read " + songfile);
			e.getStackTrace();			
		}
		
		if (messages != null && !messages.isEmpty()) {
			String[] messageArray = new String[messages.size()];
			for(int i=0; i<messages.size(); i++) {
				messageArray[i] = (String)messages.get(i);
			}
			return messageArray;			
		}

		return null;
	}
	public static void println() {
		System.out.println();
	}
	public static void println(String prompt, String message) {
		if (prompt == null) {
			prompt = "";
		}
		System.out.println(prompt + message);
	}
	public static void println(String prompt, String[] messages) {
		int i=1;
		for(String message : messages) {
			println(prompt+" " + i++ + ": ", message);
		}
	}
}
