package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ProgramGrades {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);  
        Student student = new Student();

        sc.nextLine();
        student.gr = sc.nextDouble();
        student.gr1 = sc.nextDouble();
        student.gr2 = sc.nextDouble();

        if (student.Grades() >= 60.00) {
            System.err.println(student);
            System.out.println("PASS");
        }
        else {
            System.out.println(student);
            System.out.println("FAILED");
            double missing = 60.00 - student.Grades();
            System.out.printf("%s %.2f %s", "MISSING", missing, "POINTS");
        }

        sc.close();    
    }
}
