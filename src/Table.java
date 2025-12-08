import java.util.*;
class Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :" );
        int n= sc.nextInt();
        int table;
        for(int i=1; i<=10; i++) {
            table = n * i;

            System.out.println(table);
        }
    }
}




