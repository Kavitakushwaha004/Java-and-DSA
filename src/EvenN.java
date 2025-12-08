import java. util.*;
class EvenN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n upto even no. print:");
        int n= sc.nextInt();
        System.out.println("All Even numbers are upto n:");
        for(int i=0; i<n; i=i+2) {
            System.out.println(i);
        }
    }
}