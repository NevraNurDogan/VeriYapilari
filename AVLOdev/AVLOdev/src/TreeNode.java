class TreeNode {
    long studentNo;
    String name;
    String surname;
    int age;
    int height;
    TreeNode left, right;

    public TreeNode(long studentNo, String name, String surname, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = 1;
    }
}