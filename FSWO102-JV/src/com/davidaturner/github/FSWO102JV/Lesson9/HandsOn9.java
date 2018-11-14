package com.davidaturner.github.FSWO102JV.Lesson9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		
		DogFactory df = new DogFactory();
		Dog poulenc = df.createDog("poulenc");		
		CatFactory cf = new CatFactory();
		Cat toadie = cf.createCat("toadie");
		CowFactory wf = new CowFactory();
		Cow lorraine = wf.createCow("lorraine");
		
		System.out.println("Dog(s) created: ");
		System.out.println(toby.getName());
		System.out.println(poulenc.getName());
		System.out.println();		
		
		System.out.println("Cat(s) created: ");		
		System.out.println(tonto.getName());
		System.out.println(toadie.getName());
		System.out.println();
		
		System.out.println("Cow(s) created: ");
		System.out.println(cornell.getName());
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
        boolean inputOver = false;
        
        AnimalFactory animalFactory = new AnimalFactory();
        Animal candidate = null;
        ArrayList<Animal>animalList = new ArrayList<Animal> ();
        
        try 
        {
        	while (!inputOver )
        	{
            	System.out.println("Enter Animal type: ");
                type = reader.readLine();
                
                if (type.toLowerCase().equals("exit"))
                {
//                	System.out.println("Exiting input mode...");
                	System.out.println();
                	inputOver = true;
                }
                else
                {
                    System.out.println("Adding a " + type + " to the Zoo.");   
                    candidate = animalFactory.createAnimal(type);
                    if (candidate != null)
                    {
                    	animalList.add(candidate);
                    }                 
                }
        	}
        	
        	if (animalList != null && !animalList.isEmpty())
        	{
        		int dogcount=0;
        		int catcount=0;
        		int cowcount=0;
            	for(Animal animal : animalList)
            	{
            		if (animal.getType().toLowerCase().equals("dog"))
            		{
            			dogcount++;
            		}
            		else if (animal.getType().toLowerCase().equals("cat"))
            		{
            			catcount++;
            		}
            		else if (animal.getType().toLowerCase().equals("cow"))
            		{
            			cowcount++;
            		}
            	} 
            	
            	System.out.println("Zoo contains " + ((dogcount>0)?dogcount:"no")
            			+ " dog(s), " + ((catcount>0)?catcount:"no")
            			+ " cat(s), and " + ((cowcount>0)?cowcount:"no") 
            			+ " cow(s).");
        	}
        } 
        catch (Exception e)
        {
        	System.out.println("Exception encountered: " +e);
        }

		System.out.println();		
	}
	
	public void Step3 ()
	{
		System.out.println("STEP 3: ");
		System.out.println();
		
	    // simple Animal object using only mandatory parameters
		System.out.println("Simple build - mandatory parameters only.");
	    AnimalBuilder builder = new AnimalBuilder("cow", "Callas", 7, 48.00f, 24.00f, 300, "female", "el cow-o");
	    Animal myCowCallas = builder.build();	    
	    System.out.println("My " + myCowCallas.age + " year(s) old " + myCowCallas.gender + 
	    						" " + myCowCallas.type + " is named " + myCowCallas.name);
		System.out.println();	
		
	    // complex Animal object using additional setters from AnimalBuilder class
		System.out.println("Complex build - optional parameters added.");
	    builder = new AnimalBuilder("cow", "Callas", 7, 48.00f, 24.00f, 300, "girl", "el cow-o")
	    					.setFarmCity("Pittsburgh").setFarmName("Cornpone Farms")
	    					.setFarmState("Pennsylvania").setGrassFeed(true);
	    myCowCallas = builder.build();
	    
	    System.out.println("My " + (myCowCallas.grassFeed?"grass fed":"not grass fed") + " " + myCowCallas.gender + 
	    						" " + myCowCallas.scientificName + " is named " + myCowCallas.name + 
	    					". She lives at my farm " + myCowCallas.farmName + " in " + 
	    					myCowCallas.farmCity + " " + myCowCallas.farmState + ".");	    
		System.out.println();	
		System.out.println();	
		System.out.println("DONE! But maybe not yet???");
		System.out.println();
		System.out.println();
		
		// optional step. uncomment if you want to see another Builder.
		//Step4();
	}
	
	public void Step4 ()
	{
		System.out.println("STEP 4: ");
		System.out.println();
		
		Zoo noahsArk = new NoahsArk( new NoahsArkBuilder() );
		noahsArk.gatherAnimals();
		System.out.println();
		noahsArk.buildCompound();
		System.out.println();
		noahsArk.executeMission();;
		System.out.println();
		noahsArk.describeStaff();
		System.out.println();
		noahsArk.exitStrategy();
		System.out.println();
		
		System.out.println();
		System.out.println();

	}
}
