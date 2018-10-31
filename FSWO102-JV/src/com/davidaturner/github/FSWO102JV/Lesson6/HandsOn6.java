package com.davidaturner.github.FSWO102JV.Lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandsOn6 {

	public static String[] songs;
	public static String fileStr = "songs.txt";

	public HandsOn6 ()
	{
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		HandsOn6.songs = songs;
	}
	
	public void Step1()
	{
		
		System.out.println("STEP 1");
		
		formatSongs();
		System.out.println();
		
	}
	
	private String formatSongs()
	{
		StringBuilder sb = new StringBuilder();
		String lastTitle = songs[songs.length-1];
		for(String title: songs)
		{
			System.out.println("Concatenating song title... " + title);
			// Format song title with comma and space except when lastTitle.
			if (title.equals(lastTitle))
			{
				sb.append(title + " ");					
			}
			else
			{
				sb.append(title + ", ");				
			}
		}
		
		System.out.println();
		System.out.println("Resulting string?");
		System.out.println(sb.toString());
		
		return sb.toString();
	}
	
	
	public void Step2()
	{
		System.out.println("STEP 2");

		
		String fileStringWrite = "";
		
		try{

			FileWriter writer = new FileWriter( fileStr);
			
			fileStringWrite = "SONGS STORED: " + formatSongs();
			writer.write( fileStringWrite );

			writer.close();
			
		}
		// catch errors that happened in the try block
		catch(Exception e)
		{
			System.out.println(">>Error when writing " + fileStr.toLowerCase() + "<<");
			e.printStackTrace();
		}
		finally
		{
			System.out.println();
			System.out.println("String to store: ");
			System.out.println(fileStringWrite);
			System.out.println( "   ...SUCCESSFUL! String stored in the file: " + fileStr.toLowerCase());
			System.out.println();
		}

	}
		
	public void Step3()
	{
		System.out.println("STEP 3");

		
		String fileContentsRead = "";		
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader( fileStr));
			String line;
			while ((line = reader.readLine()) != null) {
				fileContentsRead = fileContentsRead + line;
			}
			reader.close();	
			
		} 
		catch (IOException e) 
		{		
			System.out.println(">>Error when reading " + fileStr.toLowerCase() + "<<");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Retrieving String from the file : " + HandsOn6.fileStr.toLowerCase());
			System.out.println("   ...SUCCESSFUL! String retrieved");
			System.out.println(fileContentsRead);
			System.out.println();
		}

	}
}
