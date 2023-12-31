public class BagliListe {
    Node head=null;
    Node tail=null;
    void basaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
        }
        else{
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }
    }

    void sonaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
        }
        else{
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
        }
    }
    void yazdir(){
        Node temp=head;
        System.out.print("baş->");
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("son");
    }

    void sondanYazdir(){
        Node temp=tail;
        System.out.print("son");
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print("baş");
    }
    void arayaEkle(int indis,int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
        }
       else if(head!=null && indis==0){
           eleman.next=head;
           head.prev=eleman;
           head=eleman;
        }
       else{
           int n=0;
           Node temp =head;
           while(temp!=null){
               temp=temp.next;
               n++;
           }
           temp=head;
           if(indis>=n){
               tail.next=eleman;
               eleman.prev=tail;
               tail=eleman;


           }
           else{
               int i=0;
               while(i!=indis){
                   temp=temp.next;
                   i++;
               }
               eleman.prev=temp.prev;
               temp.prev.next=eleman;
               eleman.next=temp;
               temp.prev=eleman;
           }
        }
    }
    void bastanSil(){
        if(head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                head.prev=null;
            }
        }
    }

    void sondanSil(){
        if(head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next=null;
            }
        }
    }
    void aradanSil(int indis) {
        if (head != null) {
            if (head.next == null && indis <= 0) {
                head = null;
                tail = null;
            } else if (head.next != null && indis <= 0) { //baştan sil
                head = head.next;
                head.prev = null;
            } else {
                int n = 0;
                Node temp = head;
                while (temp != null) {
                    n++;
                    temp = temp.next;
                }
                if (indis >= (n - 1)) {//sondan sil
                    tail = tail.prev;
                    tail.next = null;
                } else {//aradan sil
                    temp = head;
                    int i = 0;
                    while (i < indis) {
                        i++;
                        temp = temp.next;
                    }

                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
        }
    }
}
