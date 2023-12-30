import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListeYapisi tekYonList=new ListeYapisi();
        tekYonList.basaEkle(10);
        tekYonList.basaEkle(20);
        tekYonList.basaEkle(30);
        tekYonList.basaEkle(40);
        tekYonList.basaEkle(50);
        tekYonList.sonaEkle(11);
       System.out.println("ilk eleman :"+tekYonList.head.data);
        System.out.println("son eleman :"+tekYonList.tail.data);
        tekYonList.yazdir();
        tekYonList.arayaEkle(3,25);
        tekYonList.yazdir();
        tekYonList.arayaEkle(6,55);
        tekYonList.yazdir();
        tekYonList.arayaEkle(0,1);
        tekYonList.yazdir();
        tekYonList.sondanSil();
        tekYonList.yazdir();
        tekYonList.sondanSil();
        tekYonList.yazdir();
        tekYonList.sondanSil();
        tekYonList.yazdir();
        tekYonList.sondanSil();
        tekYonList.yazdir();
        tekYonList.sondanSil();
        tekYonList.yazdir();
        tekYonList.aradanSil(2);
        tekYonList.yazdir();
        tekYonList.aradanSil(0);
        tekYonList.yazdir();

        tekYonList.arayaEkle(5,44);
        tekYonList.yazdir();

    }
}