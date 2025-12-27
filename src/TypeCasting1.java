import java.util.*;
class TypeCasting1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character:");
        char ch=sc.next().charAt(0);   //
        int n=(int)ch;
        System.out.println("Its ASCII value is  "+n);


    }
}