import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите массив размером" + size + ":\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        deleteSameElements object = new deleteSameElements();
        arr = object.deleteSameElements(arr);

        System.out.println("Преобразованный массив:" + '\n');
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}



class deleteSameElements{

    public int[] deleteSameElements(int[] arr){

        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[arrLength - 1];
                    arrLength--;
                    j--;
                }
            }
        }

        int[] resArr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            resArr[i] = arr[i];
        }

        return resArr;
    }

}