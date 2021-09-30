package org.studyeasy;

public class Hello {

public static void main(String[] arg) { 

Person john = new Person();
 System.out.println(john);
//	 john.age = -10;
// System.out.println(john);
 
 
 Person pooja = new Person("POOJA",21,"FEMALE");
 System.out.println(pooja);
 
 pooja.setAge(12);
 System.out.println(pooja);
}
	
}
