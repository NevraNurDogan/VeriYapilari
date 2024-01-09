import java.util.Scanner;

public class Merge {

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
        mergeSort(dizi, 0, n - 1);
        System.out.println("Merge sort ile sıralama işlemi yapıldı.");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + "\t");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            // Sol yarıyı sırala
            mergeSort(arr, low, mid);

            // Sağ yarıyı sırala
            mergeSort(arr, mid + 1, high);

            // Birleştir
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Geçici diziler oluştur
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Geçici dizilere elemanları kopyala
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[mid + 1 + j];

        // Geçici dizileri birleştir
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Geriye kalan elemanları kopyala (eğer varsa)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
