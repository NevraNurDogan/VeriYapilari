import java.util.Scanner;

public class BagliList {
    Scanner scanner=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    void basaEkle(){
        int data;
        System.out.println("Datayı giriniz:");
        data= scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
        }
        else{
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }
    }
    void sonaEkle(){
        int data;
        System.out.println("Datayı giriniz:");
        data= scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
        }
        else{
            tail.next=eleman;
            tail=eleman;
            tail.next=head;
        }
    }
    void arayaEkle(){
        int data;
        int indis;
        System.out.println("İndisi giriniz:");
        indis= scanner.nextInt();
        System.out.println("Datayı giriniz:");
        data= scanner.nextInt();
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
        }
        else if(indis==0){
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }
        else {

            int n=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=tail){
                temp=temp.next;
                n++;
            }
            n++;
            if(indis>=(n)){
                tail.next=eleman;
                tail=eleman;
                tail.next=head;
            }
            else{
                temp=head;
                temp2=temp;
                int i=0;
                while (i<indis){
                    i++;
                    temp2=temp;
                    temp=temp.next;
                }
                temp2.next=eleman;
                eleman.next=temp;

            }
        }
    }
    void yazdir(){
        if(head==null){
            System.out.println("Liste boş.");
        }
        else{
            Node temp=head;
            System.out.print("baş->");
            while(temp!=tail){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print(temp.data+"->son");
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
        else {
            head=head.next;
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
        else {
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
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
        else {
            int indis,n=0;
            System.out.println("İndisi giriniz:");
            indis= scanner.nextInt();
            Node temp=head;
            Node temp2=temp;

            while(temp!=tail){
                temp=temp.next;
                n++;
            }
            n++;
            temp=head;
            int i=0;
            while(i<indis){
                temp2=temp;
                temp=temp.next;
                i++;
            }
            temp2.next=temp.next;

        }
    }
}
