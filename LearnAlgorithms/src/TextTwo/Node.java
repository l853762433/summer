package TextTwo;

public class Node<T extends Comparable<T>> {
		
	public Node<T> left;
	public Node<T> right;
	public T data;
	public int height;
	public Node(T data) {
		this(null,null,data);
	}
	public Node(Node<T> left,Node<T> right,T data) {
		this(left,right,data,0);
		
	}
	public Node(Node<T> left,Node<T> right,T data,int height) {
		this.left=left;
		this.right=right;
		this.data=data;
		this.height=height;
	}
	
	
}
