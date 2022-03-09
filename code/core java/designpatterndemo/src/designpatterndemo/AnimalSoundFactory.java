package designpatterndemo;

import java.util.InputMismatchException;

public class AnimalSoundFactory {
	
	public static Animal getAnimal(String type) {
		switch (type) {
		case "dog":
			return new Dog();
		case "cat":
			return new Cat();
		case "lion":
			return new Lion();
		default:
			throw new InputMismatchException();
		}
	}

}
