public class Java_20260813_04_AnimalDemo {
	 public static void main(String[] args){

		    Java_20260813_04_Animal animal = new Java_20260813_04_Animal("Cukko");
   	  	 Java_20260813_04_Dog dog = new Java_20260813_04_Dog("Bruno", "Labrador");
		    Java_20260813_04_Animal animalDog = new Java_20260813_04_Dog("Shake","Husky");

	    animal.eat();
		 animal.makeSound();
		 
		 dog.eat();
		 dog.makeSound();
		 dog.displayBreed();
		 dog.fetch();
		 
		 animalDog.eat();
		 animalDog.makeSound();
		 //animalDog.displayBreed();
		 //animalDog.fetch();
		 
	 }
}

