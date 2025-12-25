import java.util.*;
class ReverseOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        System.out.print("Reverse of numbers are");
        int rev=n;
        while(rev>=1){
            System.out.print(rev);
            rev--;
        }
    }
}