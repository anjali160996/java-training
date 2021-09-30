package org.studyeasy.parentchild;

public class demo {
	public static void main(String[] args) {
//		Phone p = new Phone();
//		
//		System.out.println(p.getModel());
//		System.out.println(p.getMfd());
		
		Phone p = new Phone("Nokia", "20210916");
		
		System.out.println(p.getModel());
		System.out.println(p.getMfd());
		
		System.out.println("---");
		
		Realme r = new Realme();
		System.out.println(r.getModel());
		System.out.println(r.getMfd());
		System.out.println(r.getCamera());
		
		System.out.println("---");
		
		Realme r1 = new Realme("AA", "BB");
		System.out.println(r1.getModel());
		System.out.println(r1.getMfd());
		System.out.println(r1.getCamera());
		
		System.out.println("---");
		
		Realme r3 = new Realme("14MP", "CC", "DD");
		System.out.println(r3.getModel());
		System.out.println(r3.getMfd());
		System.out.println(r3.getCamera());
		
		System.out.println("---");
	}
}
