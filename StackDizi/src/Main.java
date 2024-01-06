public class Main {
    public static void main(String[] args) {
        StackYigin stack=new StackYigin(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        //stack.push(60);
        System.out.println("Çıkan: "+stack.pop());
        System.out.println("Çıkan: "+stack.pop());
        System.out.println("Çıkan: "+stack.pop());
        System.out.println("Çıkan: "+stack.pop());
        System.out.println("Çıkan: "+stack.pop());
       // System.out.println("Çıkan: "+stack.pop());


    }
}