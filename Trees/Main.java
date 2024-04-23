package Trees;
import Trees.BST;
public class Main {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8};
    BST tree = new BST();
    tree.populate(nums);
    tree.display();
    }
}
