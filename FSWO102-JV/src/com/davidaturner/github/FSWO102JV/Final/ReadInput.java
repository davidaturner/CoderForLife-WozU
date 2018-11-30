package com.davidaturner.github.FSWO102JV.Final;

import java.util.Scanner;

public class ReadInput {

    public static Scanner sc;
    
    public void OpenInput()
    {
    	sc = new Scanner(System.in);
    }
    
    public String ReadLine(String optPrompt)
    {
    	if (optPrompt != null && !optPrompt.isEmpty())
    	{
    		System.out.print(optPrompt);
    	}
    	
    	return ReadLine();
    }
    public String ReadLine()
    {
    	return (sc != null)? sc.nextLine() : null;
    }
    
    
    public int ReadInteger(String optPrompt)
    {
    	if (optPrompt != null && !optPrompt.isEmpty())
    	{
    		System.out.print(optPrompt);
    	}
    	
    	return ReadInteger();
    }
	public int ReadInteger()
	{
		return (sc != null)? sc.nextInt() : -1;
	}
	
	
    public short ReadShort(String optPrompt, boolean addEOLN)
    {
    	if (optPrompt != null && !optPrompt.isEmpty())
    	{
    		System.out.print(optPrompt);
    	}
    	
    	return ReadShort();
    }
	public short ReadShort()
	{
		return (sc != null)? sc.nextShort() : -1;
	}
	
	
	
	
	public void CloseInput()
	{
		sc.close();
	}
	
}
