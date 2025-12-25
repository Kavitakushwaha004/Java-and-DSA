import java.util.*;
class GreatestNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enetr b:");
        int b=sc.nextInt();
        if(a>b) {
            System.out.print("a is greater..");
        }
        else{
            System.out.print("b is grater");
        }
    }
}