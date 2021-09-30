package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Hello {

	public static void main(String[] args) {

		// Laptop lappy = new Laptop();
		// System.out.println(lappy.getProcessor().getBrand());
		// System.out.println(lappy.getGraphicsCard());
		/*Processor processor = new Processor();
		GraphicsCard graphicsCard = new GraphicsCard();*/
		Laptop gamingLaptop = new Laptop(17f, new Processor()	,"DDR4", "2TB",new GraphicsCard(), "MLT layer", "backlit");
 System.out.println(gamingLaptop.getProcessor().getFreq());
 //gamingLaptop.gamingMode();
 gamingLaptop.getProcessor().setFreq(gamingLaptop.getProcessor().getMaxfreq());
 System.out.println(gamingLaptop.getProcessor().getFreq());
	}

}
