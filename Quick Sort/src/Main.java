import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu girin: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        QuickSort.quickSort(arr, 0, n - 1);

        System.out.println("Sıralanmış dizi:");
        QuickSort.diziYazdir(arr);
    }
}