import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Binary search (İkili arama) algoritması
    public static boolean binarySearch(int[] array, int start, int end, int target) {
        while (end >= start) {
            int middle = (start + end) / 2;
            if (target == array[middle]) {
                return true;
            }
            if (target < array[middle]) {
                end = middle - 1;
            }
            if (target > array[middle]) {
                start = middle + 1;
            }
        }
        return false;
    }
    public static void quickSort(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int pivot = array[(i + j) / 2];

        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        } while (i < j);

        if (i < end) {
            quickSort(array, i, end);
        }
        if (start < j) {
            quickSort(array, start, j);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int i = 0;

        while (i < n) {
            System.out.print("Sayi: ");
            array[i] = scanner.nextInt();
            i++;
        }

        quickSort(array, 0, n - 1);
        System.out.println("Dizideki sayılar hızlı bir şekilde sıralandı...");
        System.out.println("Sıralı Dizi: " + Arrays.toString(array));

        System.out.print("Aranan sayıyı giriniz: ");
        int target = scanner.nextInt();

        boolean result = binarySearch(array, 0, n - 1, target);

        if (result) {
            System.out.println(target + " sayı dizide var.");
        } else {
            System.out.println(target + " sayı dizide yok.");
        }
    }
}
