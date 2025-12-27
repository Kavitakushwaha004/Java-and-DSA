// using if else or while loop
/*
import java.util.*;
class StudentMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        while (n==1){
        System.out.print("Enter a marks of Student:");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("This is very Good");
        } else if (marks <= 89 && marks >= 60) {
            System.out.println("This is  Good");
        } else if (marks <= 59 && marks >= 35) {
            System.out.println("This is also Good ");
        } else if (marks <= 34 && marks >= 0) {
            System.out.println("This is ok ok.....");
        } else {
            System.out.println("Invalid marks");
        }
        System.out.println("Want to continue ? (for yes enter 1)and (for no enter 0)");
        n = sc.nextInt();

        } if(n==0) {
            System.out.println("Stop...");
        }else{
            System.out.println("Invalid Choice");
        }

    }
}
*/
// using do while loop and if else
import java.util.*;
class StudentMarks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter marks:");
            int marks=sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is very Good");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is  Good");
            } else if (marks <= 59 && marks >= 35) {
                System.out.println("This is also Good ");
            } else if (marks <= 34 && marks >= 0) {
                System.out.println("This is ok ok.....");
            } else {
                System.out.println("Invalid marks");
            }
            System.out.println("Want to continue ? for yes enter 1 and for no enter 0");
             n=sc.nextInt();
        }while(n==1);
        if(n==0){
            System.out.println("Stop");
           } else{
          System.out.print("Invalid Choice");
        }
    }
}