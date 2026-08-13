public class java_20260813_creation_aggregation{
	public static void main(String[] args){
		  java_20260813_Teacher_aggregation teacher = new java_20260813_Teacher_aggregation("John");
		  java_20260813_Department_aggregation department = new java_20260813_Department_aggregation(teacher);

		  teacher.getTeacher();
		  department.getTeacher();
	}
}

