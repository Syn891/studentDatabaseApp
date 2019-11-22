
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snaser
 */
public class StudentDatabaseApp {

    public static void main(String[] args) {
        //Ask how many new students
        System.out.print("How many students would you like to enrol?: ");
        Scanner in = new Scanner(System.in);
        int enrollees = in.nextInt();
        Student[] students = new Student[enrollees];
        
        for(int i = 0; i<enrollees; i++)
        {
            students[i] = new Student();
            students[i].enrol();
            students[i].payTuition();
            students[i].toString(); 
        }
    }
    
}
