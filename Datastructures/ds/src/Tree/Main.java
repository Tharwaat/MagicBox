package Tree;
import BST.BsTree;

public class Main {

	public static void main(String[] args) {
		BsTree<Integer> tree = new BsTree<>();		
		tree.add(15);
		tree.add(13);
		tree.add(17);
		tree.add(14);
		tree.add(12);
		tree.add(16);
		tree.add(18);
		
		tree.DisplayTree();
		
		BsTree<Character> t2 = new BsTree<>();
		t2.add('s');
		t2.add('t');
		t2.add('a');
		
		t2.DisplayTree();
	}

}
