package animal.bird;

import animal.Animal;

public class Bird extends Animal{

	protected boolean feather = true;
	protected boolean canFly = true;
	
	
	
	public Bird() {
		super();
		this.feather = true;
		this.canFly = true;
	}



	public String ShowInfo() {
		return "Bird [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet + ", weightInKilos="
				+ weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	

}
