package linkedLists;

public class SingleNode {
	private SingleNode next;
	private Object data;
	
	// Constructor
	SingleNode(){}
	
	SingleNode(Object data){
		this.data = data;
	}
	
	//Methods
	public void setData(Object item) {
		this.data = item;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public void setNext(SingleNode node) {
		this.next = node;
	}
	
	public SingleNode getNext() {
		return this.next;
	}
}
