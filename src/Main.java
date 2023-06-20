import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        PalindromCheck object = new PalindromCheck();
        boolean palindrom = object.isPalindrom(word);
        System.out.println(palindrom);

    }
}


