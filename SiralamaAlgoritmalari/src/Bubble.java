import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        //bıbble sort en büyük değeri bulup sona doğru taşıyan
        //iç içe iki for döngüsü kullanılır.
        // 7 5 1 3 2
        int n;
        System.out.println("kaç adet sayi girmek istersiniz?");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int dizi[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("sayi:");
            dizi[i]=scanner.nextInt();
        }
        bubbleSort(dizi,n);
        System.out.println("Bubble sort ile sıralama işlemi yapıldı.");
        for(int i=0;i<n;i++){
            System.out.print(dizi[i]+"\t");
        }
    }
    private static void bubbleSort(int[] dizi, int n) {
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(dizi[j]>dizi[j+1]){
                    int gecici=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=gecici;
                }
            }
        }
    }
}