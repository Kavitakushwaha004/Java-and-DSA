import java.util.*;
class UpperLowerTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        // Upper Triangle
        for(int i=1; i<=n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Lower Triangle
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++ ){
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }
}