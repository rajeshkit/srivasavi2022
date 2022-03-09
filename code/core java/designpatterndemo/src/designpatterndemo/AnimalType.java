package designpatterndemo;

public class AnimalType {
	public static void main(String[] args) {
		Animal p1=AnimalSoundFactory.getAnimal("dog");
		Animal c1=AnimalSoundFactory.getAnimal("cat");
		Animal l1=AnimalSoundFactory.getAnimal("lion");
	}
}
