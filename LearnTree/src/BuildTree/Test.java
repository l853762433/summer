package BuildTree;



public class Test {

	public static void main(String[] args) {
		BinTreeTraverse binTree = new BinTreeTraverse();  
        binTree.createBinTree(); 

        
        // nodeList�е�0����������ֵ��Ϊ���ڵ�  
        Node root = nodeList.get(0);  
  
        System.out.println("���������");  
        preOrderTraverse(root);  
        System.out.println();  
  
        System.out.println("���������");  
        inOrderTraverse(root);  
        System.out.println();  
  
        System.out.println("���������");  
        postOrderTraverse(root);  
	}

	private static void postOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		
	}

	private static void inOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		
	}

	private static void preOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		
	}

}
