import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tree {
    private TreeNode root;
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
    private int balanceFactor(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }
    private TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }
    private TreeNode insert(TreeNode node, long studentNo, String name, String surname, int age) {
        if (node == null) {
            return new TreeNode(studentNo, name, surname, age);
        }
        if (studentNo < node.studentNo) {
            node.left = insert(node.left, studentNo, name, surname, age);
        } else if (studentNo > node.studentNo) {
            node.right = insert(node.right, studentNo, name, surname, age);
        } else {
            //aynı öğrenciyi eklemeye çalışırsa ekleme.
            return node;
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = balanceFactor(node);

        //LL
        if (balance > 1 && studentNo < node.left.studentNo) {
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && studentNo > node.right.studentNo) {
            return leftRotate(node);
        }

        // LR
        if (balance > 1 && studentNo > node.left.studentNo) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && studentNo < node.right.studentNo) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public void insert(long studentNo, String name, String surname, int age) {
        root = insert(root, studentNo, name, surname, age);
    }
    public void dosyadanOku(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                long studentNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                String surname = parts[2];
                int age = Integer.parseInt(parts[3]);
                root = insert(root, studentNo, name, surname, age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private TreeNode deleteNode(TreeNode root, long studentNo) {
        if (root == null) {
            return root;
        }
        if (studentNo < root.studentNo) {
            root.left = deleteNode(root.left, studentNo);
        } else if (studentNo > root.studentNo) {
            root.right = deleteNode(root.right, studentNo);
        } else {
            if ((root.left == null) || (root.right == null)) {
                TreeNode temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                TreeNode temp = minValueNode(root.right);
                root.studentNo = temp.studentNo;
                root.right = deleteNode(root.right, (int) temp.studentNo);
            }
        }

        if (root == null) {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = balanceFactor(root);

        // LL
        if (balance > 1 && balanceFactor(root.left) >= 0) {
            return rightRotate(root);
        }

        // LR
        if (balance > 1 && balanceFactor(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR
        if (balance < -1 && balanceFactor(root.right) <= 0) {
            return leftRotate(root);
        }

        // LL
        if (balance < -1 && balanceFactor(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void deleteNode(long studentNo) {
        root = deleteNode(root, studentNo);
    }
    private int subtreeSize(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftSize = subtreeSize(node.left);
            int rightSize = subtreeSize(node.right);
            return leftSize + rightSize + 1;
        }
    }

    private TreeNode findNode(TreeNode node, long studentNo) {
        if (node == null || node.studentNo == studentNo) {
            return node;
        }

        if (studentNo < node.studentNo) {
            return findNode(node.left, studentNo);
        } else {
            return findNode(node.right, studentNo);
        }
    }
    public int subtreeSize(long studentNo) {
        TreeNode node = findNode(root, studentNo);
        if (node == null) {
            return 0;
        } else {
            return subtreeSize(node);
        }
    }
    private TreeNode findMinNode(TreeNode node) {
        if (node == null || node.left == null) {
            return node;
        }
        return findMinNode(node.left);
    }
    private TreeNode findMaxNode(TreeNode node) {
        if (node == null || node.right == null) {
            return node;
        }
        return findMaxNode(node.right);
    }

    public void showMinMaxValues(long studentNo) {
        TreeNode node = findNode(root, studentNo);
        if (node == null) {
            System.out.println("Düğüm bulunamadı.");
        } else {
            TreeNode minNode = findMinNode(node);
            TreeNode maxNode = findMaxNode(node);

            System.out.println("Subtree'de En Küçük Değer: " + minNode.studentNo);
            System.out.println("Subtree'de En Büyük Değer: " + maxNode.studentNo);
        }
    }
    private void printLeafNodes(TreeNode node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.println(node.studentNo + "\t" + node.name + "\t" + node.surname + "\t" + node.age);
            } else {
                printLeafNodes(node.left);
                printLeafNodes(node.right);
            }
        }
    }
    public void printLeafNodes() {
        System.out.println("Ağacın Yaprak Düğümleri:");
        printLeafNodes(root);
    }
    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.studentNo + "\t" + node.name + "\t" + node.surname + "\t" + node.age);
            inorderTraversal(node.right);
        }
    }
    private void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.studentNo + "\t" + node.name + "\t" + node.surname + "\t" + node.age);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }

    private void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.studentNo + "\t" + node.name + "\t" + node.surname + "\t" + node.age);
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }
    public void preOrderTraversal() {
        preOrderTraversal(root);
    }
    public void postOrderTraversal() {
        postOrderTraversal(root);
    }
}