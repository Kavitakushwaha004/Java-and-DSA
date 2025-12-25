import java.util.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        if(n%2==0) {
            System.out.print("Even no.");
        }
        else{
            System.out.print("Odd no.");
        }
    }

}