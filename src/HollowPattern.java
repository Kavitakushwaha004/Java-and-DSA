import java.util.*;
class HollowPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int rows=sc.nextInt();
        System.out.print("Enter Coulmn:");
        int col=sc.nextInt();
        for(int i=1; i<=rows; i++ ){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1  ||  i==rows || j==col) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}