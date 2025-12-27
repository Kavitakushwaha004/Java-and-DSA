import java.util.*;
class VowelConsonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.print("Vowel");
                break;

            default:
                if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
                    System.out.print("Consonant");
                }else{
                    System.out.print("Not an alphabet");
            }
        }

    }
}