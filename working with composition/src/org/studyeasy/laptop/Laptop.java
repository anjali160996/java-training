package org.studyeasy.laptop;
 
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;
 
public class Laptop {

private float screen;
private Processor processor;
private String ram;
private String hardDisk;
private GraphicsCard graphicsCard;
private String opticalDrive;
private String keyboard;


public Laptop() {
	this.screen = 15.6f;
	this.processor =  new Processor();
	this.ram = "DDR4";
	this.hardDisk = "2TB";
	this.graphicsCard = new GraphicsCard();
	this.opticalDrive = "MLT layer";
	this.keyboard = "backlit";	
	
}





public Laptop(float screen, Processor processor, String ram, String hardDisk, GraphicsCard graphicsCard,
		String opticalDrive, String keyboard) {
	super();
	this.screen = screen;
	this.processor = processor;
	this.ram = ram;
	this.hardDisk = hardDisk;
	this.graphicsCard = graphicsCard;
	this.opticalDrive = opticalDrive;
	this.keyboard = keyboard;
}


@Override
public String toString() {
	return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDisk=" + hardDisk
			+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
}


public Processor getProcessor() {
	return processor;
}


public GraphicsCard getGraphicsCard() {
	return graphicsCard;
}



public String gamingMode() {
	processor.setFreq(processor.getMaxfreq());
	return "SUCCESS"; 
}













		

	

}
