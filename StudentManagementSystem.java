import java.util.Scanner;
import java.util.ArrayList;

class Student{
    private String name;
    private int age;
    private String major;

    public Student (String name, int age, String major)
    {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName()
    {
        return name;
    }

    public void displayStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}


public class StudentManagementSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true){
            //Create a menu with the following options
            //Option 1: Add students
            //Option 2: View Students
            //Option 3: Quit
            System.out.println("Select an Option:");
            System.out.println("1: Add a student    2: View students    3: Quit");
            int userinput = input.nextInt();
            input.nextLine();

            switch(userinput){
                case 1:
                    System.out.println("Enter student name: ");
                    String name = input.nextLine();
                    System.out.println("Enter student age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter student major: ");
                    String major = input.nextLine();
                case 2:

                case 3:

            }
        }

    }
}