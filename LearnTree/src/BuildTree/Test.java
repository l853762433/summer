package BuildTree;



public class Test {

	public static void main(String[] args) {
		BinTreeTraverse binTree = new BinTreeTraverse();  
        binTree.createBinTree(); 

        
        // nodeList中第0个索引处的值即为根节点  
        Node root = nodeList.get(0);  
  
        System.out.println("先序遍历：");  
        preOrderTraverse(root);  
        System.out.println();  
  
        System.out.println("中序遍历：");  
        inOrderTraverse(root);  
        System.out.println();  
  
        System.out.println("后序遍历：");  
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
