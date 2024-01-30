package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		String [] availableIDs = TimeZone.getAvailableIDs();
		
		int i =0;
		
		for(i =0; i < availableIDs.length; i++) {
			i++;
			System.out.println(i);
		}
		
		
		
		for (String id : availableIDs) {
			
			System.out.println(id);	
			
		}
	}
}
