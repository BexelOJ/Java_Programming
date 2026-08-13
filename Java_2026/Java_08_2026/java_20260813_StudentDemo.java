public class java_20260813_StudentDemo {

    public static void main(String[] args) {

        java_20260813_Student student =
            new java_20260813_Student("Rahul", 101, 85.5);

        System.out.println(student.getName());
        System.out.println(student.getMarks());

        student.setMarks(92.0);

        System.out.println(student.getMarks());
    }
}

