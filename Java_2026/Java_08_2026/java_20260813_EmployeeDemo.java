public class java_20260813_EmployeeDemo {

	 public static void main(String[] args){
		  java_20260813_Employee e1 = new java_20260813_Employee(1,"Alice",50000);	  
		  java_20260813_Employee e2 = new java_20260813_Employee(2,"Bob",60000);
		  java_20260813_Employee e3 = new java_20260813_Employee(3,"Carol",70000);

		  double bon_1 = e1.calculateBonus();
		  double bon_2 = e2.calculateBonus(20);

		  e1.displayDetails();
		  e2.displayDetails();
		  e3.displayDetails();

		  System.out.println(e1.calculateBonus());
		  System.out.println(e2.calculateBonus(20));

		  System.out.println("\nTotal Employees:" + e1.getEmployeeCount());
  		  //System.out.println(java_20260813_Employee.getEmployeeCount());
	 }
}

