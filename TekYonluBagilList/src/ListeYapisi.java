public class ListeYapisi {
    Node head=null;
    Node tail=null;
    void ekle(int x){
        Node eleman=new Node();//eklenecek olan düğüm
        eleman.data=x;
        if(head==null){
            head=eleman;
            tail= eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
        }
        else{
            tail.next=eleman;
            tail=eleman;
            System.out.println("Listenin sonuna düğüm eklendi.");
        }
    }
    void yazdir(){
        if(head==null){
            System.out.println("Liste boştur");
        }
        else{
            Node temp=head;
            System.out.print("baş->");
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println("<-son");
        }

    }
    void basaEkle(int x){
        Node eleman=new Node();
        eleman.data=x;
        if (head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("Liste yapısı oluşturuldu,ilk eleman eklendi");

        }
        else{
            eleman.next=head;
            head=eleman;
            System.out.println("Başa eleman eklendi.");
        }

    }

    void sonaEkle(int x){
        Node eleman=new Node();
        eleman.data=x;
        if (head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("Liste yapısı oluşturuldu,ilk eleman eklendi");

        }
        else{
            tail.next=eleman;//eleman ekledik
            tail=eleman;//isim güncelledik

            System.out.println("Sona eleman eklendi");
        }
    }
    void arayaEkle(int indis,int x){
        Node eleman=new Node();
        eleman.data=x;
        if (head==null && indis==0){
            head=eleman;
            tail=eleman;
            eleman.next=null;
            System.out.println("Liste yapısı oluşturuldu,ilk eleman eklendi");
        }
        else if (head!=null && indis==0){
            eleman.next=head;
            head=eleman;
            System.out.println(indis +" indisinci sıraya eklendi.");
        }
        else{
            int n=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=null){
                n++;
                temp2=temp;
                temp=temp.next;
            }
            if(n==indis){
                temp2.next=eleman;
                eleman.next=null;
            }
            else{
                temp=head;
                temp2=head;
                int i=0;
                while(i!=indis){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println(indis+" inidisinci sıraya eleman eklendi.");
            }
        }
    }
    void bastanSil(){
        Node eleman=new Node();
        if(head==null){
            System.out.println("Liste boş");
        }
        else if( head.next==null){
            head=null;
            tail=null;
            System.out.println("Listedeki son elaman silindi.");
        }
        else{
            head=head.next;
            System.out.println("Baştaki eleman silindi");
        }
    }
    void sondanSil(){
        Node eleman=new Node();
        if(head==null){
            System.out.println("Liste boş");
        }
        else if( head.next==null){
            head=null;
            tail=null;
            System.out.println("Listedeki son elaman silindi.");
        }
        else{
            Node temp=head;
            Node temp2=head;
            while(temp.next!=null){
                temp2=temp;//son düğümden bir önceki düğümü temsil ediyor
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
            System.out.println("Liste sondan eleman silindi.");
        }
    }
    void aradanSil(int indis){
        if(head==null){
            System.out.println("Liste boş");
        }
        else if(head.next==null  && indis==0){//tek elemanlı listeyse ve ilk eleman silinecekse
            head=null;
            tail=null;
            System.out.println("Liste kalan son  eleman silindi.");

        }
        else if(head.next!=null  && indis==0){//tek elemanlı bir liste değil ve ilk eleman silinecekse
            head=head.next;
            System.out.println("Baştaki  eleman silindi.");

        }
        else{
            int i=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if(i==indis){//Sondan eleman silinecekse
                temp2.next=null;
                tail=temp2;
                System.out.println("Listedeki son  eleman silindi.");
            }
            else{
                temp=head;
                temp2=head;
                int j=0;
                while(j!=indis){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }
                temp2.next=temp.next;
                System.out.println("Aradaki eleman silindi.");
            }
        }

    }
}
