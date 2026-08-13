public class java_20260813_car{
	public String brand;
	public String model;
	public int year;
	 
	java_20260813_car(String a, String b, int y){
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
	 java_20260813_car car_1 = new java_20260813_car("Toyota","Corolla",2024);
	 java_20260813_car car_2 = new java_20260813_car("Honda","City",2025);

	 car_1.displayDetails();
	 car_2.displayDetails();
	 System.out.println();

	 }
}







