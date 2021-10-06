package org.studyeasy;

import org.studyeasy.phone.Nokia3310;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.SamsungNote8;

public class Hello {

	public static void main(String[] args) {

//      Phone phone = new Phone("Nokia");
//		System.out.println(phone.getModel());
//		System.out.println(phone);
//		phone.features();
//		SamsungNote8 note8 = new SamsungNote8("note8");
//		note8.features();
//		System.out.println(note8.getModel());
    
		Phone nokia = new Hello().phone(1);
		
//		Phone nokia = new Nokia3310("Nokia 3310");
		System.out.println(nokia.getModel());
		nokia.features();
		
		Phone note8 = new Hello().phone(2);
		//Phone note8 = new SamsungNote8("note 8");
		System.out.println(note8.getModel());	
		note8.features();
		
	}


	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1: return new Nokia3310("3310");
		case 2: return new SamsungNote8("note 8");
		}
		return null;
	}
	
}
