import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

class CalisanListesi {
    Calisan head;
    public CalisanListesi() {
        this.head = null;
    }
    public void append(Calisan calisan) {
        Calisan newNode = new Calisan(calisan.id, calisan.isim, calisan.soyisim, calisan.yas, calisan.maas);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Calisan current = head;
            Calisan previous = null;

            do {
                if (current.yas > newNode.yas ||
                        (current.yas == newNode.yas && current.maas > newNode.maas) ||
                        (current.yas == newNode.yas && current.maas == newNode.maas && current.isim.compareTo(newNode.isim) > 0) ||
                        (current.yas == newNode.yas && current.maas == newNode.maas && current.isim.equals(newNode.isim) && current.id > newNode.id)) {
                    break;
                }
                previous = current;
                current = current.next;
            } while (current != head);

            newNode.next = current;
            if (previous == null) {

                Calisan lastNode = getLastNode();
                lastNode.next = newNode;
                head = newNode;
            } else {

                previous.next = newNode;
            }
        }
    }

    public void printListAlphabetical() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }
        Calisan[] calisanDizisi = new Calisan[size()];
        int index = 0;

        Calisan current = head;
        do {
            calisanDizisi[index++] = current;
            current = current.next;
        } while (current != head);

        Arrays.sort(calisanDizisi, new Comparator<Calisan>() {
            @Override
            public int compare(Calisan c1, Calisan c2) {
                return c1.isim.compareToIgnoreCase(c2.isim);
            }
        });

        for (Calisan calisan : calisanDizisi) {
            System.out.println(calisan.id + "\t" + calisan.isim + "\t " + calisan.soyisim +
                    "\t" + calisan.yas + "\t" + calisan.maas);
        }
    }

    private int size() {
        int count = 0;
        Calisan current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    public void delete(String isim, String soyisim) {
        if (head == null) {
            System.out.println("Liste boş, silme işlemi yapılamaz.");
            return;
        }

        Calisan current = head;
        Calisan previous = null;

        do {
            if (current.isim.equals(isim) && current.soyisim.equals(soyisim)) {
                if (previous == null) {
                    if (head.next == head) {
                        head = null;
                    } else {

                        previous = getLastNode();
                        previous.next = head.next;
                        head = head.next;
                    }
                } else {
                    previous.next = current.next;
                    if (current == head) {
                        head = current.next;
                    }
                }
                System.out.println("Silme işlemi başarılı.");
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Verilen isim ve soyisime sahip bir eleman bulunamadı.");
    }

    private Calisan getLastNode() {
        Calisan temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }

    public double ortalamaMaas() {
        if (head == null) {
            System.out.println("Liste boş, ortalama maaş hesaplanamaz.");
            return 0.0;
        }
        Calisan current = head;
        int toplamMaas = 0;
        int calisanSayisi = 0;

        do {
            toplamMaas += current.maas;
            calisanSayisi++;
            current = current.next;
        } while (current != head);

        return (double) toplamMaas / calisanSayisi;
    }
    public void kurumBilgisi() {
        if (head == null) {
            System.out.println("Liste boş, kurum bilgisi hesaplanamaz.");
            return;
        }

        int toplamMaas = 0;
        int calisanSayisi = 0;

        Calisan current = head;
        do {
            toplamMaas += current.maas;
            calisanSayisi++;
            current = current.next;
        } while (current != head);

        double ortalamaMaas = (double) toplamMaas / calisanSayisi;

        System.out.println("Toplam Personel Maaşı: " + toplamMaas + " TL");
        System.out.println("Ortalama Personel Maaşı: " + String.format("%.2f", ortalamaMaas) + " TL");
        System.out.println("Toplam Personel Sayısı: " + calisanSayisi);
    }
    public void searchAndPrint(String isim, String soyisim) {
        if (head == null) {
            System.out.println("Liste boş, arama yapılamaz.");
            return;
        }

        Calisan current = head;

        do {
            if (current.isim.equals(isim) && current.soyisim.equals(soyisim)) {
                System.out.println(isim + " " + soyisim + " listede mevcuttur. Yaşı: " + current.yas +
                        ", Maaşı: " + current.maas + ", Gelir durumu: " +
                        (current.maas > ortalamaMaas() ? "üst gelirli" : "alt gelirli"));
                return;
            }

            current = current.next;
        } while (current != head);

        System.out.println(isim + " " + soyisim + " listede mevcut değildir.");
    }
    public void printList() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }
        Calisan current = head;
        do {
            System.out.println( current.id + "\t" + current.isim + "\t " + current.soyisim +
                    "\t" + current.yas + "\t" + current.maas);
            current = current.next;
        } while (current != head);
    }
    public void writeToFile(String dosyaAdi) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            if (head == null) {
                writer.write("Liste boş, yazdırma işlemi yapılamaz.");
            } else {
                Calisan current = head;
                do {
                    writer.write(current.toString());
                    writer.newLine();

                    current = current.next;
                } while (current != head);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Eklendi.");
    }
    public String toString() {
        return "\t" + getLastNode() + "\t" ;
    }
}