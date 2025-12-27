import java.util.*;
class Butterfly{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        //Upper part
        for(int i=1;i<=n; i++){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
          //  for(int k=n; k>=i; k--){
          //      System.out.print(" "+" ");
          //  }
            // 2nd part
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        // lower part
        for(int i=n; i>=1; i--){
            // 1st part
          for(int j=1; j<=i; j++){
              System.out.print("*");
        }
        //for(int i=1; i<=n; i++){
         //   for(int j=n; j>=i; j--){
          //      System.out.print("*");
         //   }
            // Spaces
            int spaces=2*(n-i);
          for(int j=1; j<=spaces; j++){
              System.out.print(" ");
          }
           // for(int j=1; j<=i; j++){
          //      System.out.print(" "+" ");
          //  }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // 2nd part
           // for(int k=n; k>=i; k--){
           //     System.out.print("*");
           // }
            System.out.println();
        }

    }
}
