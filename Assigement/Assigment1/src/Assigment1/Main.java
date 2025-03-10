// Name: Mohammed Karim El Moussadeq
// date: 02/02/2025

package Assigment1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(20,"karim","101000755");
        Student student2 = new Student(24,"Sanyam","202000766");
        student1.displayDetails();
        student2.displayDetails();



        System.out.println("\nUpdated student 1 information");
        student1.setName("Mohammed Karim");
        student1.setAge(21);
        student1.setStudentID("101000756");
        student1.displayDetails();


        System.out.println("\n Updated student 2 information\n");
        student2.setName("Sanyam College");
        student2.setAge(21);
        student2.setStudentID("101000656");



        Student.changeUniversityName("Global Tech University");
        System.out.println("||------Student 1------||");
        student1.displayDetails();
        System.out.println("\n||-----Student 2-----||");
        student2.displayDetails();

    }
}