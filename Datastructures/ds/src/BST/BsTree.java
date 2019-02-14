package BST;

import java.util.Comparator;

import Tree.Tree;

public class BsTree<E extends Comparable<E>> implements Tree<E>, Comparator<E> {
	
	private BsNode<E> root;
	
	// Constructor
	public BsTree(){
		this.root = null;
	}
	
	// Printing Tree elements
	public void DisplayTree() {
		Print(this.root);
	}
	
	public void Print(BsNode<E> node) {
		if(node == null) return;
		
		System.out.print(node.getData() + " ");
		Print(node.getLeft());
		Print(node.getRight());
	}

	
	// Addition
	@Override
	public void add(E data) {
		this.root = addRecursive(root, data);
	}
	
	private BsNode<E> addRecursive(BsNode<E> currentNode, E data) {
		
		if(currentNode == null) return new BsNode<E>(data);
		
		if(compare(data, currentNode.getData()) < 0) 
			currentNode.setLeft(addRecursive(currentNode.getLeft(), data));
		
		else if(compare(data, currentNode.getData()) > 0) 
			currentNode.setRight(addRecursive(currentNode.getRight(), data));
		
		else return currentNode;
		
		return currentNode;
	}

	
	// Utilities
	@Override
	public int compare(E Object1, E Object2) {
		return Object1.compareTo(Object2);
	}

	
}
