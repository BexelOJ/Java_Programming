public class Java_20260813_01_Student {

    private String name;
    private int rollNumber;
    private double marks;

    public Java_20260813_01_Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            System.out.println("Invalid marks");
        }
    }
}

