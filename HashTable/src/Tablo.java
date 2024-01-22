public class Tablo {
    Node dizi [];
    int size;
    public Tablo( int size) {
        this.size = size;
        this.dizi = new Node[size];
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
        while(temp.next!=null){//soana ekleme yaptı
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

    }
}
