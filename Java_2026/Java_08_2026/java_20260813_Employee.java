public class java_20260813_Employee {
	 private final int employeeId;
	 private String name;
	 private double salary;
	 private static int employeeCount = 0;

	 java_20260813_Employee(int employeeId, String name, double salary){
		  this.employeeId = employeeId;
		  this.name = name;
		  this.salary = salary;
		  employeeCount++;
	 }

	 public void displayDetails(){
		  System.out.println("Employee ID: "+ this.employeeId);
		  System.out.println("Name: "+ this.name);
		  System.out.println("Salary: "+ this.salary+ "\n");
	 }

	 public int getEmployeeCount(){
		  return employeeCount;
	 }

	 public double calculateBonus(){
		  return (salary * 10)/100.00;
	 }

	 public double calculateBonus(double percentage){
		  return (salary * percentage)/100.00;	 
	 }

}

