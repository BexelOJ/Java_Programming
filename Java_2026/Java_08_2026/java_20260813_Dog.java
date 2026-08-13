public class java_20260813_Dog extends java_20260813_Animal{
	 private String breed;

	 /*
	 java_20260813_Dog(String name, String breed){
		  super(name);
		  this.breed = breed;
	 }*/

	 public void displayBreed(){
		  System.out.println("Breed: " + breed);	 	 	 
	 }

	 @Override
	 public void makeSound(){
		  System.out.println("Dog barks");	 	 
	 }

	 public void fetch(){
	 	 System.out.println("Dog is fetching");
	 }

}

