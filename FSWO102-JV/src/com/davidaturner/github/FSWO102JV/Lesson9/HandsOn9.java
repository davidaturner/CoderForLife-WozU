package com.davidaturner.github.FSWO102JV.Lesson9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HandsOn9 {

	public void Step1 ()
	{
		System.out.println("STEP 1: ");
		System.out.println();
		
		System.out.println("Starting Animal Factory(ies)...");
		System.out.println();
		AnimalFactory af = new AnimalFactory();
		
		Animal toby = af.createAnimal("toby", "dog");
		Animal tonto = af.createAnimal("tonto", "cat");
		Animal cornell = af.createAnimal("cornell", "cow");
		
		Dog alfred = af.createDog("alfred");
		Cat pompeii = af.createCat("pompeii");
		Cow husker = af.createCow("husker");
		
		DogFactory df = new DogFactory();
		Dog poulenc = df.createDog("poulenc");		
		CatFactory cf = new CatFactory();
		Cat toadie = cf.createCat("toadie");
		CowFactory wf = new CowFactory();
		Cow lorraine = wf.createCow("lorraine","cow");
		
		System.out.println("Dogs created: ");
		System.out.println(toby.getName());
		System.out.println(alfred.getName());
		System.out.println(poulenc.getName());
		System.out.println();		
		
		System.out.println("Cats created: ");		
		System.out.println(tonto.getName());
		System.out.println(pompeii.getName());
		System.out.println(toadie.getName());
		System.out.println();
		
		System.out.println("Cow created: ");
		System.out.println(cornell.getName());
		System.out.println(husker.getName());
		System.out.println(lorraine.getName());
		System.out.println();
		
		System.out.println();
	}
	
	public void Step2 ()
	{
		System.out.println("STEP 2: ");
		System.out.println();
		
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name;
        String type;
        try 
        {
        	System.out.println("Enter Animal name and type: ");
            name = reader.readLine();
            type = reader.readLine();
            System.out.println("Creating a " + type + " named " + name);
        } 
        catch (Exception e)
        {
        	System.out.println("Exception encountered: " +e);
        }

		System.out.println();		
	}
	
	public void Step3 ()
	{
//		System.out.println("STEP 1: ");
//		System.out.println();
		
//		System.out.println();		
	}
}
