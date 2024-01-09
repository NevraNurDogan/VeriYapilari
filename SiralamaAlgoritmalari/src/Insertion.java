import java.util.Scanner;

public class Insertion {
    //İnsertion Sort (eklemeli sıralama algoritması
    //iki for dögüsü
    //7 3 5 1 2
    public static void main(String[] args) {
        int n;
        System.out.println("kaç adet sayi girmek istersiniz?");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int dizi[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("sayi:");
            dizi[i]=scanner.nextInt();
        }
        insortSort(dizi,n);
        System.out.println("İnsertion sort ile sıralama işlemi yapıldı.");
        for(int i=0;i<n;i++){
            System.out.print(dizi[i]+"\t");
        }
    }

    private static void insortSort(int[] dizi, int n) {
        for(int i=1;i<n;i++){
            for(int k=i;k>0;k--){{
               if (dizi[k]<dizi[k-1]){
                   int temp=dizi[k];
                   dizi[k]=dizi[k-1];
                   dizi[k-1]=temp;

                    }
               }
            }
        }
    }
}
