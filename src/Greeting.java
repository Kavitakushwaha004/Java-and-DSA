import java.util.*;
class Greeting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Johar");
                break;
            case 3:
                System.out.println("Hello");
                break;
            case 4:
                System.out.println("hii");
                break;
            default:
                System.out.println("No Greetings");
        }

    }
}
    // by boolean
  /*      boolean isWelcome = true;
        if (isWelcome) {
            System.out.print("Namaste");
        } else {
            System.out.println("Goodbye");
        }
    }
}*/