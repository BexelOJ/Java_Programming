public class java_20260813_AnimalDemo {
	 public static void main(String[] args){

		 java_20260813_Animal animal = new java_20260813_Animal();
		 java_20260813_Dog dog = new java_20260813_Dog();
		 java_20260813_Animal animalDog = new java_20260813_Dog();

		 animal.makeSound();
		 dog.makeSound();
		 animalDog.makeSound();
		 animalDog.eat();
		 animalDog.fetch();

	 }
}

