/*import java.util.*;
class PyramidType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr n:");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
import java.util.*;
class PyramidType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr n:");
        int n= sc.nextInt();
         /*for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}