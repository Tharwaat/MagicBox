package linkedLists;

import javax.swing.LayoutStyle;

public class SingleLinkedList {
	
	private static SingleNode Head;
	private static int ListSize;
	
	// Constructors
	SingleLinkedList() {
		Head = null;
		ListSize = 0;
	}
	
	SingleLinkedList(int size) {
		Head = null;
		ListSize = size;
	}
	
	// Setters and getters
	public static SingleNode getHead() {
		return Head;
	}


	public static void setHead(SingleNode head) {
		Head = head;
	}


	public static int size() {
		return ListSize;
	}


	public static void setListSize(int listSize) {
		ListSize = listSize;
	}
	
	// Additions
	public static void AddHead(Object item) {
		SingleNode BeforeHead = getHead();
		
		SingleNode NewHead = new SingleNode(item);
		NewHead.setNext(BeforeHead);		
		setHead(NewHead);
		
		setListSize(size()+1);
	}
	
	public static void AddTail(Object item) {
		SingleNode CurrentNode = getHead();
		
		if(CurrentNode == null) {
			AddHead(item);
			return;
		}
		
		while(CurrentNode.getNext() != null) CurrentNode = CurrentNode.getNext();
		SingleNode LastNode = new SingleNode(item);
		CurrentNode.setNext(LastNode);
		
		setListSize(size()+1);
	
	}
	
	// Printing list's content
	public void Print() {		
		SingleNode node = getHead();
		
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
}
