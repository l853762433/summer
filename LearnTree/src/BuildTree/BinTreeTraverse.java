package BuildTree;

import java.util.LinkedList;
import java.util.List;

public class BinTreeTraverse {
		
	  int [] array= {1,2,3,4,5,6,7,8,9};
	  static List<Node> nodeList=null;
	  static class Node{
		Node leftChild;
		Node rightChild;
		int data;
		Node(int newData){
			leftChild=null;
			rightChild=null;
			data=newData;
		}
	}
	public void createBinTree() {
		
		nodeList =new LinkedList<Node>();
		for (int nodeIndex=0; nodeIndex<array.length;nodeIndex++) {
			nodeList.add(new Node(array[nodeIndex]));
		}
		for (int parentIndex=0;parentIndex<array.length/2-1;parentIndex++) {
			nodeList.get(parentIndex).leftChild=nodeList.get(parentIndex*2+1);
			nodeList.get(parentIndex).rightChild=nodeList.get(parentIndex*2+2);
		}
		int lastParentIndex=array.length/2-1;
		nodeList.get(lastParentIndex).leftChild=nodeList.get(lastParentIndex*2+1);
		if(array.length%2==1) {
			nodeList.get(lastParentIndex).rightChild=nodeList.get(lastParentIndex*2+2);
		}
	}
	//�������
    public static void preOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        System.out.print(node.data + " ");  
        preOrderTraverse(node.leftChild);  
        preOrderTraverse(node.rightChild);  
    } 
    //�������
    public static void inOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        inOrderTraverse(node.leftChild);  
        System.out.print(node.data + " ");  
        inOrderTraverse(node.rightChild);  
    }  
    //�������
    public static void postOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        postOrderTraverse(node.leftChild);  
        postOrderTraverse(node.rightChild);  
        System.out.print(node.data + " ");  
    }  
	
	
}