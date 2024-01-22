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
        hTable.ekle(1,"Nevra");
        hTable.ekle(6,"Nur");
        hTable.ekle(7,"Doğan");
        hTable.sil(15);
        hTable.ara(1);
        hTable.ara(22);

        hTable.yazdir();

    }
}