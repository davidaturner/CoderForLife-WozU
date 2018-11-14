package com.davidaturner.github.FSWO102JV.Lesson9;

public class NoahsArk extends Zoo {

	public NoahsArk( ZooBuilder builder)
	{
		super( "Noah's Ark", builder);	
	}
	
	@Override
	public void buildCompound() {
		System.out.println("An Ark is built according to Biblical requirements.");
		
	}

	@Override
	public void executeMission() {
		System.out.println("This Ark should endure 40 days of unrelenting rain.");
		
	}

	@Override
	public void describeStaff() {
		System.out.println("Noah, his Wife, and Children shall maintain the Zoo.");
		
	}

	@Override
	public void exitStrategy() {
		System.out.println("Once the animals disembark safely, this Ark will be dealt with (TO-DO)");
		
	}

}
