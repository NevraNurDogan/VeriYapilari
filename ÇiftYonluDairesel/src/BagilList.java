import java.util.Scanner;

public class BagilList {
    Scanner scanner=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    Node temp=null;
    Node temp2=null;
    int data;
    int indis;
    void basaEkle(){
        System.out.println("Data giriniz:");
        data=scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else{
            eleman.next=head;
            head.prev=eleman;

            head=eleman;

            tail.next=head;
            head.prev=tail;

        }

    }
    void sonaEkle(){
        System.out.println("Data giriniz:");
        data=scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else{
           tail.next=eleman;
           eleman.prev=tail;
           tail=eleman;
           tail.next=head;
           head.prev=tail;

        }

    }
    void arayaEkle(){
        System.out.println("İndis giriniz:");
        indis=scanner.nextInt();
        System.out.println("Data giriniz:");
        data=scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else if(indis==0){
            eleman.next=head;
            head.prev=eleman;

            head=eleman;

            tail.next=head;
            head.prev=tail;
        }
        else{
            temp=head;
            temp2=temp;
            int n=0;
            while(temp!=tail){
                n++;
                temp=temp.next;
            }
            temp=head;
            int i=0;
            while (i < indis && temp.next != head) {
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            if(n<indis){//Sona ekleme
                tail.next=eleman;
                eleman.prev=tail;
                tail=eleman;
                tail.next=head;
                head.prev=tail;
            }
            else{
                temp2.next=eleman;
                eleman.prev=temp2;
                eleman.next=temp;
                temp.prev=eleman;
            }
        }
    }
    void yazdir(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else{
           temp=head;
            System.out.print("baş->");
            while(temp!=tail){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print(temp.data+"->son");
            System.out.println();

        }
    }
    void sondanYazdir(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else{
            temp=tail;
            System.out.print("son->");
            while(temp!=head){
                System.out.print(temp.data+"->");
                temp=temp.prev;
            }
            System.out.print(temp.data+"->baş");
        }
    }
    void bastanSil(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=tail;
            tail.next=head;

        }
    }
    void sondanSil(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            temp=head;
            while (temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
            head.prev=tail;
        }
    }
    void aradanSil(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            System.out.println("İndis giriniz:");
            indis=scanner.nextInt();
            if(indis==0 && head==tail){
                head=null;
                tail=null;
            }
           else if(indis==0 && head!=tail){
                head=head.next;
                head.prev=tail;
                tail.next=head;
            }
           else{
               int n=0;
               temp=head;
               while(temp.next!=tail){
                   n++;
                   temp=temp.next;
               }
               n++;
               if(indis==n){
                   tail=temp;
                   tail.next=head;
                   head.prev=tail ;

               }
               else{
                   temp=head;
                   temp2=temp;
                   int i=0;
                   while(i<indis){
                       i++;
                       temp2=temp;
                       temp=temp.next;
                   }
                   temp2.next=temp.next;
                   temp.next.prev=temp2;
               }
            }
        }
    }
}
