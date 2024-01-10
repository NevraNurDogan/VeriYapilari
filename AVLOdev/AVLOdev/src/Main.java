import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Tree avlTree = new Tree();
        String dosyaYolu="C:\\Users\\Casper\\OneDrive\\Masaüstü\\Kayıt.txt";
        avlTree.dosyadanOku(dosyaYolu);
        while(true){
        System.out.println("Menü:");
        System.out.println("a-) Insert fonksiyonu");
        System.out.println("b-) İnorder, Preorderi ,postorder sıralamaları ");
        System.out.println("c-) Delete fonksiyonu");
        System.out.println("d-) Oluşan subtree üzerinde kaç adet düğüm olduğunu bul");
        System.out.println("e-) Oluşan subtree üzerinde en küçük ve en büyük düğüm değerleri ");
        System.out.println("f-) Yapraklarını ekrana yaz");
        System.out.println("Seçim giriniz:");
        String secim= scanner.nextLine();

        switch (secim){
            case "a":
                avlTree.insert(999999999,"A","B",14);
                break;
            case "b":
                System.out.println("Öğrenci Bilgileri (inorder):");
                avlTree.inorderTraversal();
                System.out.println("Öğrenci Bilgileri (Preorder):");
                avlTree.preOrderTraversal();
                System.out.println("Öğrenci Bilgileri (Postorder):");
                avlTree.postOrderTraversal();
                break;
            case "c":
                System.out.println("Silmek istediğiniz öğrencinin okulnumarasını giriniz:");
                long studentNoToDelete = scanner.nextLong();
                avlTree.deleteNode(studentNoToDelete);
                System.out.println("\nÖğrenci Bilgileri (Sıralı) - Silme Sonrası:");
                avlTree.inorderTraversal();
                break;
            case "d":
                System.out.println("Düğüm giriniz:");
                long studentNoToFindSubtreeSize = scanner.nextLong();
                int subtreeSize = avlTree.subtreeSize(studentNoToFindSubtreeSize);
                System.out.println("\nBelirli bir düğümden itibaren oluşan subtree üzerindeki düğüm sayısı: " + subtreeSize);
                break;
            case "e":
                System.out.println("Düğüm giriniz:");
                long studentNoToFindMinMax = scanner.nextLong();
                avlTree.showMinMaxValues(studentNoToFindMinMax);
                break;
            case "f":
                avlTree.printLeafNodes();
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz.");
                break;

          }
       }
    }
}