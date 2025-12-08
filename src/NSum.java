import java.util.*;
class NSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        int sum = 0;
      /*  for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}*/

//by using while loop
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}