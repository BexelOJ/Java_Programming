public class Java_20260813_00_Car{
	public String brand;
	public String model;
	public int year;
	 
	Java_20260813_00_Car(String a, String b, int y){
	 this.brand = a;
	 this.model = b;
	 this.year = y;
	}

	public void displayDetails(){
		System.out.println("\nBrand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Year: " + this.year);
	}

public static void main(String[] args){
	 Java_20260813_00_Car car_1 = new Java_20260813_00_Car("Toyota","Corolla",2024);
	 Java_20260813_00_Car car_2 = new Java_20260813_00_Car("Honda","City",2025);

	 car_1.displayDetails();
	 car_2.displayDetails();
	 System.out.println();

	 }
}







