import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalisanListesi calisanListesi = new CalisanListesi();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Casper\\OneDrive\\Masaüstü\\Kayıt.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                int age = Integer.parseInt(parts[3]);
                int salary = Integer.parseInt(parts[4]);

                Calisan person = new Calisan(id, firstName, lastName, age, salary);
                calisanListesi.append(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        calisanListesi.printList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menü\n"+
        "1=Ekleme\n"+
        "2=Silme\n" +
        "3=Arama\n" +
        "4=Alfabetik Listele\n"+
        "5=Kurum Bilgisi\n" +
        "6=Personel Kayıt\n" +
        "7=Çıkış"
                               );
        while(true){

        System.out.println("Secim girinizz:");
        int secim= scanner.nextInt();
        switch(secim){
            case 1:
                System.out.println("Liste :");
                calisanListesi.printList();
                break;
            case 2:
                scanner.nextLine();
                System.out.print("Silmek istediğiniz kişinin ismini girin: ");
                String silinecekIsim = scanner.nextLine();
                System.out.print("Silmek istediğiniz kişinin soyismini girin: ");
                String silinecekSoyisim = scanner.nextLine();
                calisanListesi.delete(silinecekIsim, silinecekSoyisim);
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Bir isim giriniz: ");
                String arananIsim = scanner.nextLine();
                System.out.print("Bir soyisim giriniz: ");
                String arananSoyisim = scanner.nextLine();
                calisanListesi.searchAndPrint(arananIsim, arananSoyisim);
                break;
            case 4:
                calisanListesi.printListAlphabetical();
                break;
            case 5:calisanListesi.kurumBilgisi();
                break;
            case 6:
                calisanListesi.writeToFile("C:\\Users\\Casper\\OneDrive\\Masaüstü\\calisanListesi.txt");
                break;
            case 7:
                return;
            default:
                System.out.print("Geçerli işlme seçiniz: ");
         }
       }

    }
}