import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Palindrom object = new Palindrom();
        boolean palindrom = object.isPalindrom(word);
        System.out.println(palindrom);

    }
}


class Palindrom{
    public boolean isPalindrom(String word) {

        int i = 0;

        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
            i++;
        }

        return true;

    }

}