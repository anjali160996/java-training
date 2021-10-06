package org.studyeasy;

import org.studyeasy.phone.OnePlus5;

public class Hello {

	public static void main(String[] args) {
	
		OnePlus5 onePlus = new OnePlus5();
		int processor = onePlus.processor();
		
	System.out.println("Processor:" +processor);

	}

}
