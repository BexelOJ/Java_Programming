public class Java_20260813_03_EmployeeDemo {

	 public static void main(String[] args){
		  Java_20260813_03_Employee e1 = new Java_20260813_03_Employee(1,"Alice",50000);	  
		  Java_20260813_03_Employee e2 = new Java_20260813_03_Employee(2,"Bob",60000);
		  Java_20260813_03_Employee e3 = new Java_20260813_03_Employee(3,"Carol",70000);

		  double bon_1 = e1.calculateBonus();
		  double bon_2 = e2.calculateBonus(20);

		  e1.displayDetails();
		  e2.displayDetails();
		  e3.displayDetails();

		  System.out.println(e1.calculateBonus());
		  System.out.println(e2.calculateBonus(20));

		  System.out.println("\nTotal Employees:" + e1.getEmployeeCount());
  		  // System.out.println(Java_20260813_03_Employee.getEmployeeCount());
	 }
}

