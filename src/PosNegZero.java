import java.util.Scanner;

class PosNegZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n :");
        int n =sc.nextInt();

        // by using if else condition
        if( n > 0) {
            System.out.println(" Positive number");
        }
        else if( n < 0) {
            System.out.println(" Negative number");
        }
        else{
            System.out.println("Zero");
        }

        // by using switch case

        switch(Integer.compare(n,0)){

            case 1 :
                System.out.println(" Positive Number");
                break;

            case 0:
                System.out.println(" Number is zero");
                break;

            case -1:
                System.out.println("Number is negative");

        }

    }
}

