import java.util.*;
class Multiplication{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n:");
      int n= sc.nextInt();
      if(n%3==0){
          System.out.println("Given n is multiple of 3");
      }else{
          System.out.println("Not multiple of 3");
      }
    }
}