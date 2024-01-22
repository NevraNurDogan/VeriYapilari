public class Node {
    int key;
    String isim;
    Node next;
    public Node() {
        this.next = null;
    }
    public Node(int key, String isim) {
        this.key = key;
        this.isim = isim;
        this.next = null;
    }
}
