import java.util.*;
class Multiple5and11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.which is multiple of 5 and 11:");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("The given no. is multiple of 5 and 11.");
        } else {
            System.out.println(" not multiple of 5 and 11.");
        }
    }
}