package com.example.demo;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if (args.length > 1) {
			System.out.println("Enter IP address only.");
		}
		else {
			String ipaddress = args[0];
			GeoIPService ipservice = new GeoIPService();
			GeoIPServiceSoap ipservicesoap = ipservice.getGeoIPServiceSoap();
			
			String ipLocation = ipservicesoap.getIpLocation(ipaddress);
			// Display on console <Country> - <State>
			System.out.println(ipLocation.substring(16, 18) +" - " + ipLocation.substring(35, 37));
			
		}

	}

}
