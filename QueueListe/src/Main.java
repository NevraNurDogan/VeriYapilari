import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Stack yapısına kaç eleman girmek istiyorsunuz?:");
        int n=scanner.nextInt();
        Queue queue=new Queue(n);
        int secim=-1,sayi;
        while(secim!=0){
            System.out.println();
            System.out.println("1) Ekle");
            System.out.println("2) Çıkar");
            System.out.println("3) Yazdır");
            System.out.println("0) Çıkış");
            System.out.println("Seçim giriniz:");
            secim=scanner.nextInt();
            switch(secim){
                case 1:
                    System.out.println("Sayi giriniz:");
                    sayi=scanner.nextInt();
                   queue.enQueue(sayi);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

            }

        }

    }
}