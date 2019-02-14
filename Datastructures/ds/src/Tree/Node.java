package Tree;

public abstract class Node<E>{
	private E data = null;
	
	protected Node(){
		data = null;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public E getData() {
		return this.data;
	}
	
}