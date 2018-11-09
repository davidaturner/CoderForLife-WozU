package com.davidaturner.github.FSWO102JV.Lesson9;

import java.util.ArrayList;

public class NoahsArk extends Zoo {

	public NoahsArk( ZooBuilder builder)
	{
		super( builder);	
	}
	
	@Override
	public void buildCompound() {
		System.out.println("The Staff plans to build an Ark according to Biblical parameters.");
		
	}

	@Override
	public void executeMission() {
		System.out.println("The Ark should endure at least 40 days of unrelenting rain.");
		
	}

	@Override
	public void describeStaff() {
		System.out.println("Noah, his Wife, and Children shall maintain the Zoo.");
		
	}

	@Override
	public void exitStrategy() {
		System.out.println("Once the animals disembark safely, the Ark will be dealt with (TO-DO)");
		
	}

}
