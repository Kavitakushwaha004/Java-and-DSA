import java.util.Scanner;

class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                if (j != 1 && j != i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            int spaces = 2 * (n - i);

            for(int j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                if (k != 1 && k != i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                if (j != i && j != 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            int spaces = 2 * (n - i);

            for(int j = 1; j <= spaces; ++j) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; ++j) {
                if (j != i && j != 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
