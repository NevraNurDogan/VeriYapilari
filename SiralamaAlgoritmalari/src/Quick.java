import java.util.Scanner;

public class Quick {

    public static void main(String[] args) {
        int n;
        System.out.println("Kaç adet sayı girmek istersiniz?");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sayı:");
            dizi[i] = scanner.nextInt();
        }
        quickSort(dizi, 0, n - 1);
        System.out.println("Quick sort ile sıralama işlemi yapıldı.");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + "\t");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
