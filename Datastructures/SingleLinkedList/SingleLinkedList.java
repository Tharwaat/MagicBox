package linkedLists;

public class SingleLinkedList {
	
	private  SingleNode Head;
	private  int ListSize;
	
	// Constructors
	SingleLinkedList() {
		this.Head = null;
		this.ListSize = 0;
	}
	
	SingleLinkedList(int size) {
		this.Head = null;
		this.ListSize = size;
	}
	
	// Setters and getters
	public  SingleNode getHead() {
		return this.Head;
	}


	public  void setHead(SingleNode head) {
		this.Head = head;
	}


	public  int size() {
		return this.ListSize;
	}


	public  void setListSize(int listSize) {
		this.ListSize = listSize;
	}
	
	// Additions
	public  void AddHead(Object item) {
		SingleNode BeforeHead = getHead();
		
		SingleNode NewHead = new SingleNode(item);
		NewHead.setNext(BeforeHead);		
		setHead(NewHead);
		
		setListSize(size()+1);
	}
	
	public  void AddTail(Object item) {
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
	
	public  void AddAt(Object item, int index) {
		int CurrentSize = size() - 1;
		SingleNode CurrentNode = getHead();
		
		if(index == 0) {
			AddHead(item);
			return;
		}
		else if(CurrentSize < index) {
			System.out.println("This index is out of range");
			return;
		}
		
		for(int i = 0; i < index - 1; i++) CurrentNode = CurrentNode.getNext();
		
		SingleNode NewNode = new SingleNode(item);
		NewNode.setNext(CurrentNode.getNext());
		CurrentNode.setNext(NewNode);
		
		setListSize(size()+1);
	}
	
	//Deletions
	public  void DeleteHead() {
		SingleNode CurrentHead = getHead();
		if(CurrentHead == null) return;
		
		SingleNode NewHead = CurrentHead.getNext();		
		setHead(NewHead);
		setListSize(size()-1);
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