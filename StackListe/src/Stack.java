public class Stack {//Bir kap gibi düşün eklerken de
    // üstten ekliyoruz çıkarırkende üstten çıkarıyoruz
    //LIFO
    int size;
    int cnt;
    Node top;//en üst düğümü tutan(head)
    public Stack(int size) {
        this.size = size;
        cnt=0;
        top=null;
    }
    void push(int data){
        Node eleman=new Node(data);
        if(isFull()){
            System.out.println("Stack dolu,ekleme yapılamadı.");
        }
        else{
            if(isEmpty()){
                top=eleman;
                top.next=null;
                System.out.println("Stack'e ilk eleman olarak eklendi.");
            }
            else{
                eleman.next=top;
                top=eleman;
                System.out.println(top.data+" Stack'e eklendi");
            }
            cnt++;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack boş,çıkarılacak bir şey yok.");
        }
        else{
            System.out.println(top.data+" çıkarıldı.");
            top=top.next;
            cnt--;
        }
    }
    void print(){

        if(isEmpty()){
            System.out.println("Stack boş,yazdırılacak bir şey yok.");
        }
        else{
            Node temp=top;
            System.out.println("Stackteki veriler:");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    void topGoster(){
        if(isEmpty()){
            System.out.println("Stack boş");
        }
        else{
            System.out.println("En üstteki düğümün datası:"+top.data);
        }
    }
    boolean isFull(){
        return cnt==size;
    }
    boolean isEmpty(){
        return cnt==0;
    }
}
