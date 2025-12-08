import java.util.*;
class ReverseN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int n = sc.nextInt();
     /*   for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("Reverse of given input is:");
        for(int i=n; i>=1; i--){
            System.out.println(i);

        }
    }
}*/
// Reverse of numbers by using while loop
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;

        }
        System.out.println("Reverse:");
        i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

}