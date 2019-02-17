package Tree;
import BST.BsTree;

public class Main {

	public static void main(String[] args) {
		BsTree<Integer> tree = new BsTree<>();		
		tree.insert(15);
		tree.insert(13);
		tree.insert(17);
		tree.insert(14);
		tree.insert(12);
		tree.insert(16);
		tree.insert(18);
		
		tree.Display();
		
		
		System.out.println();
		
		System.out.println(tree.contains(112) + " " + tree.contains(18) + " " + tree.contains(16));
		
		tree.delete(15);
		tree.Display();
		
	}

}
