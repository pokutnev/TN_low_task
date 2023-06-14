import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        Reverse object = new Reverse();
        StringBuilder rev = object.reverse(s);
        System.out.println(rev);

    }


}

class Reverse{

    public StringBuilder reverse(StringBuilder s){

        StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        return rev;

    }

}