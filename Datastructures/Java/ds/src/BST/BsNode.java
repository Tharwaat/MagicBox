package BST;

import Tree.Node;

public class BsNode<E> extends Node<E>{
	
	private BsNode<E> Parent;
	private BsNode<E> right;
	private BsNode<E> left;
	
	BsNode(){
		super();
		this.right = null;
		this.left = null;
	}
	
	BsNode(E data){
		setData(data);
		this.right = null;
		this.left = null;		
	}
	
	public BsNode<E> getRight() {
		return this.right;
	}
	
	public void setRight(BsNode<E> right) {
		this.right = right;
	}
	
	public BsNode<E> getLeft() {
		return this.left;
	}
	
	public void setLeft(BsNode<E> left) {
		this.left = left;
	}

	public void setParent(BsNode<E> parent) {
		this.Parent = parent;
	}
	
	public BsNode<E> getParent() {
		return this.Parent;
	}


}
