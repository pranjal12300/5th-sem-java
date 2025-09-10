/*1. Student Class with Average Grade 
Create a Student class with name, roll number, and list of marks. Add a method to 
calculate the average and grade. 
Bonus: Print result with grade (A/B/C/etc.) */


public class Student {
    String name;
    int rollNo;
    int[] marks;

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    char grade() {
        double avg = average();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'D';
    }
}

 class StudentTest {
    public static void main(String[] args) {
        int[] marks = {85, 78, 92};
        Student s = new Student("Alice", 101, marks);
        System.out.println("Avg: " + s.average() + " Grade: " + s.grade());
    }
}
