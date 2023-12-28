public class Queue {
    Node front;
    Node rear;
    int cnt;
    int size;

    public Queue(int size) {
        this.size = size;
        cnt=0;
        front=null;
        rear=null;
    }
    void enQueue(int data){
        if(isFull()){
            System.out.println("Kuyruk dolu,ekleme yapılamadı");
        }
        else{
            Node eleman =new Node(data);
        if(isEmpty()){
            front=eleman;
            rear=eleman;
            System.out.println(data+" Kuyruğa ilk eleman eklendi.");
        }
        else{
            rear.next=eleman;
            rear=rear.next;
            System.out.println(data+" Kuyruğa eklendi.");
          }
        cnt++;

        }
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("Kuyruk boş silinecek eleman yok.");
        }
        else{
            System.out.println(front.data+" Silindi");
            front=front.next;
            cnt--;
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Kuyruk boş yazdırılacak eleman yok.");
        }
        else{
            Node temp=front;
            System.out.print("baş <- ");
            while(temp!=null){
                System.out.print(temp.data+" <- ");
                temp=temp.next;
            }
            System.out.print("son ");
        }
    }
    public boolean isFull() {
        return cnt==size;
    }
    public boolean isEmpty() {
        return cnt==0;
    }

}
