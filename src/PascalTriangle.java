import java.util.*;
class PascalTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            //Spaces
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            int num = 1;
            for(int k=0 ; k<=i; k++){
                System.out.print(num +" " );
                num = num *(i-k)/(k+1);

           }
           System.out.println();
       }
   }
}