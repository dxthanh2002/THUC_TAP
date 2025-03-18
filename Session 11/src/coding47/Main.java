package coding47;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(new Node("5"));
        list.addItem(new Node("3"));
        list.addItem(new Node("7"));
        list.addItem(new Node("1"));
        list.addItem(new Node("9"));

        System.out.println("Linked List Traversal:");
        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(new Node("5"));
        tree.addItem(new Node("3"));
        tree.addItem(new Node("7"));
        tree.addItem(new Node("1"));
        tree.addItem(new Node("9"));

        System.out.println("\nBinary Search Tree Traversal:");
        tree.traverse(tree.getRoot());
    }
}
