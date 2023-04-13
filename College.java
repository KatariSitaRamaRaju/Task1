import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    String branch;
    double marks;

    public Student(String name, String branch, double marks) {
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getMarks() {
        return marks;
    }
}

public class College {
    public static void main(String[] args) {
        // Create a list of students with their respective names, branches, and marks.
        List<Student> students = new ArrayList<>();
        students.add(new Student("ramesh", "CSE", 85));
        students.add(new Student("gnanesh", "Mechanical", 70));
        students.add(new Student("anand", "CIVIL", 90));
        students.add(new Student("surya", "CSE", 89));
        students.add(new Student("govardhan", "Mechanical", 95));
        students.add(new Student("naveen", "CIVIL", 76));
        students.add(new Student("Ramesh", "Mechanical", 98));

        List<String> branches = new ArrayList<>();

        for (Student student : students) {
            String branch = student.getBranch();

            if (!branches.contains(branch)) {
                branches.add(branch);
            }
        }

        for (String branch : branches) {
            List<String> studentNames = new ArrayList<>();

            double sum = 0.0;
            int count = 0;
            for (Student student : students) {
                if (student.getBranch().equals(branch)) {
                    sum += student.getMarks();
                    count++;
                    studentNames.add(student.getName());
                }
            }

            double avgMarks = sum / count;

            System.out.println("Branch: " + branch);
            System.out.println("Avg Marks: " + avgMarks);
            System.out.println("Students: " + studentNames);
            System.out.println();
        }
    }
}