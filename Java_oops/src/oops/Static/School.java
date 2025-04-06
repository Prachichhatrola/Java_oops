package oops.Static;

public class School {

    String schoolName = "GEC Bhavnagar";

    // Inner class (non-static)
    class Student {
        String studentName;

        Student(String name) {
            this.studentName = name;
        }

        void displayStudentInfo() {
            // Can access outer class member
            System.out.println("Student: " + studentName + ", School: " + schoolName);
        }
    }

    // Static nested class
    static class Utility {
        static void printWelcomeMessage() {
            System.out.println("Welcome to School Management System!");
        }
    }

    public static void main(String[] args) {
        // Call static class method without creating outer class object
        School.Utility.printWelcomeMessage();

        // Create outer and inner class object
        School school = new School();
        School.Student student = school.new Student("Prachi");

        // Call inner class method
        student.displayStudentInfo();
    }
}

/*
 *  Why Do We Need Static Classes (Nested)?
 *  
 *  1. If the nested class does not need to access instance variables of the outer class, making it static saves memory.
 *  2. You can create an object of the static nested class without creating an object of the outer class.
 */

