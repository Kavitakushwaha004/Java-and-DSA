import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();

        System.out.println(" The operators are : ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter operator :");
        char op = sc.next().charAt(0);

        double Result;

        switch (op) {
            case '1':
                Result = a + b;
                System.out.println("Result =" + Result);
                break;
            case '2':
                Result = a - b;
                System.out.println("Result =" + Result);
                break;

            case '3':
                Result = a * b;
                System.out.println("Result =" + Result);
                break;
            case '4':
                if (b != 0) {
                    Result = a / b ;
                    System.out.println("Result =" + Result);
                } else {
                    System.out.println("default");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }
    }
}