package TextTwo;

public class Node {
		public Node data;
		public Node next;
		public Node(Node data,Node next) {
			this.data=data;
			this.next=next;
		}
		public Node() {
			
		}
		public Node getData() {
			return data;
		}
		public void setData(Node data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
}
