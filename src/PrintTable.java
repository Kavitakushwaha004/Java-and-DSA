import java.util.*;
class PrintTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Table of n:");
        int table=1;
        for(int i=1; i<=10; i++) {
            table=n*i;
            System.out.println(n+"*"+i+"="+table);
        }
    }
}