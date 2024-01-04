import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BagilList b= new BagilList();
        Scanner scanner=new Scanner(System.in);
        int secim=-1;
        while(secim!=0){
            System.out.println();
            System.out.println("1)Başa ekle");
            System.out.println("2)Sona ekle");
            System.out.println("3)Araya ekle");
            System.out.println("4)Baştan Sil");
            System.out.println("5)Sondan sil");
            System.out.println("6)Baştan Sil");
            System.out.println("6)Aradan Sil");
            System.out.println("7)Tersten Yazdır");
            System.out.println("0) Çıkış");

            System.out.println("Seçim giriniz:");
            secim= scanner.nextInt();
            switch (secim){
                case 1:
                    b.basaEkle();
                    break;
                case 2:
                    b.sonaEkle();
                    break;
                case 3:
                    b.arayaEkle();
                    break;
                case 4:
                    b.bastanSil();
                    break;
                case 5:
                    b.sondanSil();
                    break;
                case 6:
                    b.aradanSil();
                    break;
                case 7:
                     b.sondanYazdir();
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

            }
            b.yazdir();
        }
    }
}
