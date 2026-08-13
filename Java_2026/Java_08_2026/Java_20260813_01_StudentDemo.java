public class Java_20260813_01_StudentDemo {

    public static void main(String[] args) {

        Java_20260813_01_Student student =
            new Java_20260813_01_Student("Rahul", 101, 85.5);

        System.out.println(student.getName());
        System.out.println(student.getMarks());

        student.setMarks(92.0);

        System.out.println(student.getMarks());
    }
}

