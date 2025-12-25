import java.util.*;
class Divisible5and11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        if(n%5==0 & n%11==0){
            System.out.print(" n is divisible by 5 and 11");
        }else{
            System.out.print("n is not divisible by 5 and 11.");
        }
    }
}