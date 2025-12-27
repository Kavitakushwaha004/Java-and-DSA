import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Vowel");
                break;
            default:
                if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
                    System.out.print("Not an alphabet");
                } else {
                    System.out.print("Consonant");
                }
        }

    }
}
