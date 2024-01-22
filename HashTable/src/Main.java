public class Main {
    public static void main(String[] args) {
        Tablo hTable=new Tablo(5);
        hTable.ekle(0,"ahmet");
        hTable.ekle(10,"mehmet");

        hTable.ekle(3,"hasan");
        hTable.ekle(4,"hüseyin");

        hTable.ekle(2,"ayşe");
        hTable.ekle(22,"fatma");

        hTable.ekle(15,"beyza");
        hTable.ekle(9,"ece");
       // System.out.println(hTable.dizi[3].next.isim);
        hTable.sil(0);
        hTable.sil(2);
        hTable.sil(22);
        System.out.println(hTable.dizi[2].next.next.isim);

    }
}