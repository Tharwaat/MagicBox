public class SingleLinkedList {
	
	private static SingleNode Head;
	private static int ListSize;
	
	SingleLinkedList() {
		Head = null;
		ListSize = 0;
	}
	
	SingleLinkedList(int size) {
		Head = null;
		ListSize = size;
	}
	
	public static SingleNode getHead() {
		return Head;
	}


	public static void setHead(SingleNode head) {
		Head = head;
	}


	public static int getListSize() {
		return ListSize;
	}


	public static void setListSize(int listSize) {
		ListSize = listSize;
	}
	
	public static void AddHead(Object item) {
		SingleNode BeforeHead = getHead();
		
		SingleNode NewHead = new SingleNode(item);
		NewHead.setNext(BeforeHead);
		
		setHead(NewHead);
	}

	public void Print() {		
		SingleNode node = getHead();
		
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
}