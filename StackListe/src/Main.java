import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Stack yapısına kaç eleman girmek istiyorsunuz?:");
        int n=scanner.nextInt();
        Stack stack=new Stack(n);
        int secim=-1,sayi;
        while(secim!=0){
            System.out.println("1) Ekle");
            System.out.println("2) Çıkar");
            System.out.println("3) En üsttekini göster");
            System.out.println("4) Yazdır");
            System.out.println("0) Çıkış");
            System.out.println("Seçim giriniz:");
            secim=scanner.nextInt();
            switch(secim){
                case 1:
                    System.out.println("Sayi giriniz:");
                    sayi=scanner.nextInt();
                    stack.push(sayi);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.topGoster();
                    break;
                case 4:
                    stack.print();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

            }

        }
    }
}