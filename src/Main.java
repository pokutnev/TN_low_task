import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите массив размером" + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        EditingArray object = new EditingArray();
        arr = object.deleteSameElements(arr);

        System.out.println("Преобразованный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}



