package org.learning.advanceinteraction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY:hh:mm:ss");
		
		System.out.println(sdf.format(d));
		
		String time= sdf.format(d).replace(":", "_");
		System.out.println(time);
		
	}

}
