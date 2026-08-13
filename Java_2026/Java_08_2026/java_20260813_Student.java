public class java_20260813_Student {

    private String name;
    private int rollNumber;
    private double marks;

    public java_20260813_Student(String name, int rollNumber, double marks) {
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

