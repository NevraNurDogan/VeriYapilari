public class Tablo {
    Node dizi [];
    int size;
    public Tablo( int size) {
        this.size = size;
        dizi = new Node[size];
        for(int i=0;i<size; i++){
            dizi[i]=new Node();
        }
    }
    int IndexUret(int key){
        return key % size;
    }
    void ekle(int key ,String isim){
        int index=IndexUret(key);
        Node eleman=new Node(key,isim);
        Node temp=dizi[index];
        while(temp.next!=null){//sona ekleme yaptı
            if (temp.next.key == key) {
                System.out.println("Aynı key değeriyle zaten bir eleman eklenmiş.");
                return;
            }
            temp=temp.next;
        }
        temp.next=eleman;
        System.out.println(eleman.isim+" eklendi");
    }
    void sil(int key){
        int indis=IndexUret(key);
        Node temp=dizi[indis];
        Node temp2=dizi[indis];
        if(temp.next==null){
            System.out.println(key+" numaralı kayıt yok.");
        }
        else if(temp.next.next==null && temp.next.key==key){// 1 düğüm var
            System.out.println(temp.next.isim+" silindi.");
            temp.next=null;
        }
        else{
            while(temp.next!=null){
                temp2=temp;
                temp=temp.next;
                if(temp.key==key){
                    System.out.println(temp.isim+" silindi.");
                    temp2.next=temp.next;
                }
            }
        }
    }
    void yazdir(){
        for(int i=0;i<size;i++){
            Node temp=dizi[i];
            System.out.print("Dizi["+i+"] ->");
                while (temp.next!=null){
                    System.out.print(temp.next.key+" - "+temp.next.isim+" -> ");
                    temp=temp.next;
                }
                System.out.println();
        }
    }
    void ara(int key) {
        int index = IndexUret(key);
        Node temp = dizi[index];
        while (temp != null) {
            if (temp.key == key) {
                System.out.println("Aranan key değeri bulundu: " + temp.isim);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Aranan key değeri bulunamadı.");
    }
}
