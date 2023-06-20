import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringRotation object = new StringRotation();
        StringBuilder rev = object.reverse(s);
        System.out.println(rev);

    }


}
