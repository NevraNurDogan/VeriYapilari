import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BagliListe b= new BagliListe();
        Scanner scanner=new Scanner(System.in);

        int secim=-1;
        while(secim!=0){
            System.out.println();
            System.out.println("1)Başa ekle");
            System.out.println("2)Sona ekle");
            System.out.println("3)Yazdir");
            System.out.println("4)Sondan Yazdir");
            System.out.println("5)Araya ekle");
            System.out.println("6)Baştan Sil");
            System.out.println("7)Sondan sil");
            System.out.println("8)Aradan sil");

            System.out.println("0)Çıkış");
            System.out.println("Seçim giriniz:");
            secim= scanner.nextInt();
            switch (secim){
                case 1:
                    b.basaEkle(10);
                    b.basaEkle(20);
                    b.basaEkle(30);
                    b.basaEkle(40);
                    b.basaEkle(50);
                    break;
                case 2:
                    b.sonaEkle(11);
                    b.sonaEkle(22);
                    b.sonaEkle(33);
                    b.sonaEkle(44);
                    b.sonaEkle(55);
                    break;
                case 3:
                    b.yazdir();
                    break;
                case 4:
                    b.sondanYazdir();
                    break;
                case 5:
                    b.arayaEkle(2,67);
                    b.arayaEkle(5,89);
                    b.arayaEkle(10,111);
                    b.arayaEkle(15,211);
                    break;
                case 6:
                    b.bastanSil();
                    break;
                case 7:
                    b.sondanSil();
                    break;
                case 8:
                    b.aradanSil(2);
                    break;
            }
        }
    }
}