public class StackYigin {
    int dizi[];
    int size;
    int indis;
    public StackYigin( int size) {
        this.size = size;
        dizi=new int [size];
        indis=-1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack dolu");
        }
        indis++;
        dizi[indis]=data;
        System.out.println("eklenen:"+dizi[indis]);

    }
    int pop(){
        if(!isEmpty()){
            return dizi[indis--];
        }
        else{
            System.out.println("Dizi boş");
            return -1;
        }
    }
    boolean isFull(){
        return (indis==size-1);
    }
    boolean isEmpty(){
        return (indis==-1);
    }
}
