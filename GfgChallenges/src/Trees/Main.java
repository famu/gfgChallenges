package Trees;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(17);
		
		
//		tree.root = 15;
		tree.left = new BinaryTree(8);
		tree.right = new BinaryTree(9);
		
		tree.left.left = new BinaryTree(4);
		tree.left.right = new BinaryTree(5);
		
		tree.right.left = new BinaryTree(6);
		tree.right.right = new BinaryTree(7);

//		tree.left.left = null; 
//		t = null;
		
		
		tree.plotTree();
//		tree.pathPrint();
		
		
		
	}

}
