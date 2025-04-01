import java.util.Scanner;

// Custom Exception: Illegal Marks
class IllegalMarksException extends Exception {
    public IllegalMarksException(String message) {
        super(message);
    }
}

// Custom Exception: Fail in Exam
class FailInExamException extends Exception {
    public FailInExamException(String message) {
        super(message);
    }
}

// Custom Exception: Scholarship Denied
class ScholarshipDeniedException extends Exception {
    public ScholarshipDeniedException(String message) {
        super(message);
    }
}

// Class representing Student Marks
class MarkList {
    public int[] marks;

    // Constructor to input marks
    MarkList() throws IllegalMarksException {
        Scanner scan = new Scanner(System.in);
        marks = new int[3];

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = scan.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalMarksException("Illegal Marks: Marks should be between 0 and 100.");
            }
        }
    }

    // Constructor with predefined marks
    MarkList(int sub1, int sub2, int sub3) throws IllegalMarksException {
        if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 || sub3 < 0 || sub3 > 100) {
            throw new IllegalMarksException("Illegal Marks: Marks should be between 0 and 100.");
        }
        marks = new int[]{sub1, sub2, sub3};
    }

    // Calculate average marks
    float calcAvg() {
        float avg = 0;
        for (int mark : marks) {
            avg += mark;
        }
        return avg / marks.length;
    }

    // Display marks
    public String toString() {
        return "Subject 1: " + marks[0] + "\nSubject 2: " + marks[1] + "\nSubject 3: " + marks[2];
    }
}

// Student class
class Student {
    public String name;
    public int roll;
    MarkList m;

    // Default Constructor
    Student() throws IllegalMarksException {
        name = "xyz";
        roll = 123;
        m = new MarkList();
    }

    // Parameterized Constructor
    Student(String name, int roll, int sub1, int sub2, int sub3) throws IllegalMarksException {
        this.name = name;
        this.roll = roll;
        m = new MarkList(sub1, sub2, sub3);
    }

    // Display student details and marks
    void showMarklist() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll Number: " + this.roll);
        System.out.println(m.toString());
    }

    // Show Average Marks
    void showAvg() {
        float avg = m.calcAvg();
        System.out.println("Average Marks: " + avg);
    }
}

// Result Class extending Student
class Result extends Student {
    public Result(String name, int roll, int sub1, int sub2, int sub3) throws IllegalMarksException {
        super(name, roll, sub1, sub2, sub3);
    }

    // Check Pass/Fail
    public void result(int min) throws FailInExamException {
        if (m.marks[0] >= min && m.marks[1] >= min && m.marks[2] >= min) {
            System.out.println("Pass");
        } else {
            throw new FailInExamException("Fail in Exam: Marks are below the minimum requirement.");
        }
    }

    // Check Scholarship Eligibility
    public void result(int min, int merit) throws FailInExamException, ScholarshipDeniedException {
        if (m.marks[0] < min || m.marks[1] < min || m.marks[2] < min) {
            throw new FailInExamException("Fail in Exam: Marks are below the minimum requirement.");
        }

        float avg = m.calcAvg();
        if (avg >= merit) {
            System.out.println("Pass with Scholarship Eligibility");
        } else {
            throw new ScholarshipDeniedException("Pass (No Scholarship): Average marks below merit criteria.");
        }
    }
}

// Result Demo Class
public class ResultDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            // Input student details
            System.out.println("Enter the name of the student:");
            String name = scan.nextLine();

            System.out.println("Enter the roll number:");
            int roll = scan.nextInt();

            System.out.println("Enter marks for three subjects:");
            int sub1 = scan.nextInt();
            int sub2 = scan.nextInt();
            int sub3 = scan.nextInt();

            // Creating Student Result object
            Result student = new Result(name, roll, sub1, sub2, sub3);

            // Display details
            student.showMarklist();
            student.showAvg();

            // Check pass/fail
            System.out.println("Enter the minimum passing marks:");
            int min = scan.nextInt();

            try {
                student.result(min);
            } catch (FailInExamException e) {
                System.out.println("Exception: " + e.getMessage());
            }

            // Check scholarship eligibility
            System.out.println("Enter minimum marks required for scholarship:");
            int merit = scan.nextInt();

            try {
                student.result(min, merit);
            } catch (FailInExamException | ScholarshipDeniedException e) {
                System.out.println("Exception: " + e.getMessage());
            }

        } catch (IllegalMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
