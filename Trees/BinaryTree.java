package Trees;
import java.util.*;
public class BinaryTree {
    private class Node {
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value = val;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("enter node value:");
        int val = scanner.nextInt();
    root = new Node(val);
    populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to add left child of : " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter left node value:");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("do you want to add right child of : " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter right node value:");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }

    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent+ "\t");
        display(node.right , indent + "\t");
    }

    public void prettydisplay(){
        prettydisplay(root, 0);
    }
    private void prettydisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettydisplay(node.right, level+1);
        if(level != 0){
            for (int i = 0; i <= level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+ node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettydisplay(node.left, level+1);
    }
}
