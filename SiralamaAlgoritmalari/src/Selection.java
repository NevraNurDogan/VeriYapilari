import java.util.Scanner;

public class Selection {
    //Selection sort (seçmeli sıralama) algoritması en küçük sayıyı bul başa taşı
    public static void main(String[] args) {
        int n;
        System.out.println("kaç adet sayi girmek istersiniz?");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int dizi[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("sayi:");
            dizi[i] = scanner.nextInt();
        }
        selectionSort(dizi,n);
        System.out.println("Selection sort ile sıralama işlemi yapıldı.");
        for(int i=0;i<n;i++){
            System.out.print(dizi[i]+"\t");
        }
    }

    private static void selectionSort(int[] dizi, int n) {
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++) {
                if (dizi[min] > dizi[j])
                    min = j;
            }
                int temp=dizi[min];
                dizi[min]=dizi[i];
                dizi[i]=temp;
            }
        }
    }

