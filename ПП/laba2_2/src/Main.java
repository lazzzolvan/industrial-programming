import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Введите количество элементов массива:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr;
        arr = new int[n];
        for (i=0;i<n;i++){
            System.out.println("Введите "+i+" элемент");
            arr[i] = in.nextInt();
        }
        System.out.println("Массив:");
        for (i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Обратный массив");
        for (i=n-1;i>=0;i=i-1){
            System.out.println(arr[i]);
        }
    }
}