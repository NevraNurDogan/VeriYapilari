public class BTree {
    Node root;
    public BTree() {
        root = null;
    }
    Node newNode(int data) {
        root = new Node(data);
        System.out.println(data + " ağaca eklendi.");
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else
            root = newNode(data);
        return root;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
int height(Node root){
        if(root==null)
        return 0;
        else{
            int sol=0,sag=0;
            sol=height(root.left);
            sag=height(root.right);
            if(sol>sag)
                return sol+1;
           else {
                return sag + 1;
            }
        }
    }
    int size(Node root){
        if(root==null){
            return 0;
        }
        else{
            return size(root.left)+1+size(root.right);
        }
    }
     Node delete(Node root, int x) {
         Node t1, t2;
         if (root == null)
             return null;
         if (root.data == x) {
             if (root.left == root.right) {//silinecek düğümün altında dal yok
                 root = null;
                 return null;
             } else if (root.left == null) {//sol düğüm boşsa
                 t1 = root.right;
                 return t1;
             } else if (root.right == null) {//sağ düğüm boşsa
                 t1 = root.left;
                 return t1;
             } else {// hem sağ hemde sol düğüm varsa
                 t1 = t2 = root.right;
                 while (t1.left != null) {
                     t1 = t1.left;
                 }
                 t1.left = root.left;
                 return t2;
             }
         }
         else{
             if(x<root.data){
                 root.left=delete(root.left,x);
             }
             else{
                 root.right=delete(root.right,x);
             }
         }
         return root;
     }
}