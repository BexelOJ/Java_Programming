public class Java_20260813_association_TuitionDemo {

    public static void main(String[] args) {

        Java_20260813_association_Tuition teacher = new Java_20260813_association_Tuition();
        Java_20260813_association_TuitionStudent student = new Java_20260813_association_TuitionStudent("Alice");        

        teacher.teach(student);
    }
}

