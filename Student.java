// Carlinbhert Adryanne De Guzman
// CITCS 1N-A
// October 9, 2024
// CC2 Assignment


// class is created with student attributes
public class Student {
    private String studentID, name;
    private int age;
    private double gpa;
    
    // constructor to initialize the student's information
    public Student(String studentID, String name, int age, double gpa){
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // getter methods to allow access
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentAge() {
        return age;
    }
    
    public double getStudentGPA() {
        return gpa;
    }

// setter methods to modify information
    public void setStudentAge(int age) {
        this.age = age;
    }
    
    public void setStudentGPA(double gpa) {
        this.gpa = gpa;
    }
    
    // method to print student information
    public void displayStudentDetails(){
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
        
    public static void main(String[] args) {
        // created two student objects 
    Student myStudent1 = new Student("FirstID", "Ashara", 18, 3.40);
    Student myStudent2 = new Student("SecondID", "Arthur", 19, 4.00);
    
    // student details are displayed
    System.out.println("Student 1 details: ");
    myStudent1.displayStudentDetails();
    System.out.println("__________________");

        
    System.out.println("Student 2 details: ");
    myStudent2.displayStudentDetails();
    System.out.println("__________________");
        
    // setter method to change the gpa and age of student 1
    myStudent1.setStudentGPA(3.60);
    myStudent1.setStudentAge(20);
    
    // updated information is printed
    System.out.println("Updated Student 1 details: ");
    myStudent1.displayStudentDetails();
    System.out.println("__________________");
  }
    
}
