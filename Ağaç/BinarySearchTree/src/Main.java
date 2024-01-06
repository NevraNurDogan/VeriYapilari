public class Main {
    public static void main(String[] args) {
     BTree bt =new BTree();
     bt.root=bt.insert(bt.root,10);
     bt.root=bt.insert(bt.root,8);
     bt.root=bt.insert(bt.root,  15);
     bt.root=bt.insert(bt.root,5);
     bt.root=bt.insert(bt.root,12);
     bt.root=bt.insert(bt.root,20);
     bt.root=bt.insert(bt.root,9);
    /* System.out.println("kökün datası:"+bt.root.data);
     System.out.println("kökün sağındaki data:"+bt.root.right.data);
     System.out.println("kökün solundaki data:"+bt.root.left.data);
     System.out.println("kökün solunun solunun datası:"+bt.root.right.right.data);
     System.out.println("kökün sağının sağının  datası:"+bt.root.left.left.data);*/
     System.out.print("Pre Order:");
     bt.preOrder(bt.root);
     System.out.println();
     System.out.print("İn Order:");//küçüktenbüyüğe sıralıyor aslında.
     bt.inOrder(bt.root);
     System.out.println();
     System.out.print("Post Order:");
     bt.postOrder(bt.root);
     System.out.println();
     System.out.print("Ağacın yüksekliği:"+bt.height(bt.root));
     System.out.println();
     System.out.println("Ağacın düğüm sayısı:"+bt.size(bt.root));
     bt.root=bt.delete(bt.root,10);
     System.out.print("Silme işlmeinden sonraki liste:");
     bt.inOrder(bt.root);


    }
}