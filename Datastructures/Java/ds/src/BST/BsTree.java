package BST;

import java.util.Comparator;

import javax.xml.crypto.Data;

import Tree.Tree;
import Utils.Utilities;

public class BsTree<E extends Comparable<E>> extends Utilities implements Tree<E>{
	
	private BsNode<E> root;
	
	// Constructor
	public BsTree(){
		this.root = null;
	}
	
	// Printing Tree elements
	@Override
	public void Display() {
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
	public void insert(E NewData) {
		this.root = insertRecursive(this.root, NewData);
	}
	
	BsNode<E> insertRecursive(BsNode<E> CurrentNode, E NewData) {		
		if(CurrentNode == null) return new BsNode<E>(NewData);
		
		if(compare(NewData, CurrentNode.getData()) < 0) 
			CurrentNode.setLeft(insertRecursive(CurrentNode.getLeft(), NewData));		
		else if(compare(NewData, CurrentNode.getData()) > 0) 
			CurrentNode.setRight(insertRecursive(CurrentNode.getRight(), NewData));		
		else return CurrentNode;
		
		return CurrentNode;
	}

	
	// Searching 
	public boolean contains(E DataToFind) {
		return ContainsRecursive(this.root, DataToFind);
	}
	
	boolean ContainsRecursive(BsNode<E> CurrentNode, E DataToFind) {
		// Does not Exist
		if(CurrentNode == null) return false;
		
		if(CurrentNode.getData() == DataToFind) return true;
		
		return  compare(DataToFind, CurrentNode.getData()) < 0 
				? ContainsRecursive(CurrentNode.getLeft(), DataToFind)
				: ContainsRecursive(CurrentNode.getRight(), DataToFind);
	}
	
	
	// Deleting
	public void delete(E DataToDelete) {
		this.root = DeleteRecursive(this.root, DataToDelete);
	}
	
	BsNode<E> DeleteRecursive(BsNode<E> CurrentNode, E DataToDelete) {
		// Does not Exist
		if(CurrentNode == null) return null;
		
		E CurrentNodeData = CurrentNode.getData();
		if(compare(DataToDelete, CurrentNodeData) < 0) 
			CurrentNode.setLeft(DeleteRecursive(CurrentNode.getLeft(), DataToDelete));
		
		if(compare(DataToDelete, CurrentNodeData) > 0) 
			CurrentNode.setRight(DeleteRecursive(CurrentNode.getRight(), DataToDelete));
		
		if(CurrentNodeData == DataToDelete) {
			// Has No Children
			if(CurrentNode.getLeft() == null && CurrentNode.getRight() == null) return null;
			
			// Has Only one
			if(CurrentNode.getLeft() == null) return CurrentNode.getRight();
			if(CurrentNode.getRight() == null) return CurrentNode.getLeft();
			
			// Has Two Children, then replace the CurrentNode with
			// the smallest one in right subtree, and delete that node
			BsNode<E> InOrderSuccessor = FindInOrderSuccessor(CurrentNode.getRight());
			E InOrderSuccessorData = InOrderSuccessor.getData();
			
			CurrentNode.setData(InOrderSuccessorData);
			CurrentNode.setRight(DeleteRecursive(CurrentNode.getRight(), InOrderSuccessorData));				
		}
		
		return  CurrentNode;
	}
	
	BsNode<E> FindInOrderSuccessor(BsNode<E> CurrentNode){
		while(CurrentNode.getLeft() != null) CurrentNode = CurrentNode.getLeft();
		return CurrentNode;
	}
}
