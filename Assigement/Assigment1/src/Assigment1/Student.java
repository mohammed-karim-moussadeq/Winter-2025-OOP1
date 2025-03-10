// Name: Mohammed Karim El Moussadeq
// date: 02/02/2025


package Assigment1;

// assigning attributes
public class Student {
    private String Name;
    private int Age;
    private String StudentID;




    // default constructor
    public Student(){ }

    //A constructor that initialize all the fields
    public Student(int Age, String Name, String StudentID){
        this.Age = Age;
        this.StudentID = StudentID;
        this.Name = Name;
    }





    //Setter Methods
    public void setName(String Name){
        this.Name = Name;

    }

    public void setStudentID(String StudentID){
        this.StudentID = StudentID;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }




    //Getter Methods

    public int getAge(){
        return this.Age;
    }

    public String getName() {
        return this.Name;
    }

    public String getStudentID() {
        return this.StudentID;
    }



    // Adding a static field with a default name
    public static String universityName = "Tech University";

    public static void changeUniversityName(String newName){
        universityName = newName;
    }



    // Displaying the Details
    public void displayDetails(){

        System.out.println("\nthe Student ID is: " + this.getStudentID());
        System.out.println("The name of the student is: " + this.getName());
        System.out.println("The age of the student is:  " + this.getAge());
        System.out.println("University: " + universityName);

    }
}
