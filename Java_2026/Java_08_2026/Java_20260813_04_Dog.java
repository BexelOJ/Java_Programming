public class Java_20260813_04_Dog extends Java_20260813_04_Animal{
	 private String breed;

	 Java_20260813_04_Dog(String name, String breed){
		  super(name);
		  this.breed = breed;
	 }

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

