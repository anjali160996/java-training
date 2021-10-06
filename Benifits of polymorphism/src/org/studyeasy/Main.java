package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Main {
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		Animal animal = new Animal();
		//System.out.println(animal.ShowInfo());
		
		Animal reptile = new Reptile();
		//System.out.println(reptile.ShowInfo());
		
		Animal crocodile = new Crocodile();         //sub class reference inside super class object.
		//System.out.println(crocodile.ShowInfo());
		
		Animal eel = new Eel();
		//System.out.println(eel.ShowInfo());
		
		Animal eagle = new Eagle();
		//System.out.println(eagle.ShowInfo());
		
		
		animals.add(animal);
		animals.add(reptile);   //if reptile class doesnt have showInfo() method it will call parent class ShowInfo() version
		animals.add(crocodile);
		animals.add(eel);
		animals.add(eagle);
		PrintAnimals(animals);
		}

	public static void PrintAnimals(List<Animal> allAnimals) {
		for(Animal oneAnimal: allAnimals) {     //advance for loop
			System.out.println(oneAnimal.ShowInfo());
		}
		
		
		System.out.println("**********************************");
		//or option
		
		int size = allAnimals.size();
		for(int i=0; i<size; i++) {
			Animal oneAnimal = allAnimals.get(i);
			System.out.println(oneAnimal.ShowInfo());
		}
	}

}
