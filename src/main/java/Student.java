
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author snaser
 */
public class Student {

private String firstname;
private String surname;
private String uniqueID;
private int year;
private String courses ="";
private int tuitionBalance = 0;
private static final int courseCost = 600;
public static int id = 1000;

public Student() 
{
    this.firstname = setFirstname();
    this.surname = setSurname(); 
    this.year = setYear();
    this.uniqueID = generateID();
   
}

private String setFirstname()
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter firstname: ");
    String fname = in.next();
    
    return fname;
}

private String setSurname()
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter lastname: ");
    String sname = in.next();
    
    return sname;
}

private int setYear()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter year:\n1 - 1st year \n2 - 2nd year \n3 - 3rd year \n4 - 4th year"
            + "\n5 - 5th year");
    int year = in.nextInt();
    
    return year;
}


private String generateID()
{
  id++;
  this.uniqueID = (String)(year + "" + id);
  
  return uniqueID;
}

public void enrol() {

   while(1!=0){
        System.out.print("Enter course to enrol or Q to quit: ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if(course.equals("Q"))
        {
             break;
        }
        else 
        {
            courses = courses + "\n  " + course;
            tuitionBalance += courseCost;
        }
        } 
    
}
public void viewBalance() {
    
    System.out.print("Your balance is: " + "£" + tuitionBalance);
}

public void payTuition()
{
    System.out.print("How much would you like to pay?: £");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance -= payment;
    System.out.print("Thank you for your payment of £" + payment + ". "); 
    viewBalance();
}

public String toString(){
    return "\nName: " + firstname + " " + surname +
            "\nStudentID: " + uniqueID +
            "\nYear: " + year +
            "\nCourses Enrolled: " + courses +
            "\nBalance: £" + tuitionBalance;
}

}

