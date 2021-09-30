package org.studyeasy;

import org.studyeasy.phone.Phone;
import org.studyeasy.phone.SamsungNote8;

public class Hello {

	public static void main(String[] args) {
	
		Phone phone = new Phone("Nokia");
		
		System.out.println(phone.getModel());
		System.out.println(phone);
		phone.features();
		
		SamsungNote8 note8 = new SamsungNote8("note8");
		
		note8.features();
		System.out.println(note8.getModel());
	}

}
