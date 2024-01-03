public class Main {
    public static void main(String[] args) {
     BTree bt =new BTree();
     bt.root=bt.insert(bt.root,10);
     bt.root=bt.insert(bt.root,15);
     bt.root=bt.insert(bt.root,8);
     bt.root=bt.insert(bt.root,20);
     bt.root=bt.insert(bt.root,4);
     bt.root=bt.insert(bt.root,25);
     System.out.println("kökün datası:"+bt.root.data);
     System.out.println("kökün sağındaki data:"+bt.root.right.data);
     System.out.println("kökün solundaki data:"+bt.root.left.data);
     System.out.println("kökün solunun solunun datası:"+bt.root.right.right.data);
     System.out.println("kökün sağının sağının  datası:"+bt.root.left.left.data);
    }
}