package Trees;

import java.util.HashMap;
import java.util.Stack;

public class BinaryTree {
	
	BinaryTree left;
	BinaryTree right;
	int value;
	
	public BinaryTree() {
		this.left = null;
		this.right = null;
		this.value = 0;
	}
	public BinaryTree(int newValue) {
		this.left = null;
		this.right = null;
		this.value = newValue;
	}
	
	public void preOrder(){
		System.out.print(value+ " ");
		if(left!=null)
			left.preOrder();
		if(right!=null)
			right.preOrder();
	}
	
	public void inOrder(){
		if(this.left!=null)
			left.preOrder();
		System.out.print(this.value+ " ");
		if(this.right!=null)
			right.preOrder();
	}
	
	public void postOrder(){
		if(this.left!=null)
			left.preOrder();
		if(this.right!=null)
			right.preOrder();
		System.out.print(this.value+ " ");
	}
	
	int height(BinaryTree n){
		if(n==null) 
			return -1;
		else 
			return 1 + Math.max(height(n.left), height(n.right));
	}
	
	public boolean isSymmetric() {
		
		
		return isMirror(left,right);
	}
	//Recursive Print paths
	public void paths(){
		printPaths(this, " ");
	}
	
	private void printPaths(BinaryTree current, String path) {
		path = path + current.value + " ";
		if(current.left!=null)
			printPaths(current.left, path);
		if(current.right!=null)
			printPaths(current.right, path);
		if(current.left==null&&current.right==null){
			path = path.trim();
			System.out.print(path);
			path = path.substring(0,path.lastIndexOf(" "));		
			System.out.println();
		}
	}
	
	//non-Recursive printPath
	public void pathPrint() {
	    Stack<Object> stack = new Stack<Object>();
	    BinaryTree root = this;
	    if (root == null)
	        return;
	    stack.push(root.value + " ");
	    stack.push(root);
	    while (!stack.isEmpty()) {
	        BinaryTree temp = (BinaryTree) stack.pop();
	        String path = (String) stack.pop();

	        if (temp.right != null) {
	            stack.push(path + temp.right.value + " ");
	            stack.push(temp.right);
	        }
	        if (temp.left != null) {
	            stack.push(path + temp.left.value+ " ");
	            stack.push(temp.left);
	        }
	        if (temp.left == null && temp.right == null) {
	            System.out.println(path);
	        }
	    }
	}
	private boolean isMirror(BinaryTree left, BinaryTree right) {
		if(left == null && right == null){
			return true;
		}
		if(left.value == right.value)
			return isMirror(left.left,right.right) && isMirror(left.right, right.left); 
		return false;
	}
	
	public void plotTree(){
		char[][] buffer = new char[10][70];
		for(int i=0;i<10; i++){  
			for(int j=0;j<buffer[0].length;j++){  
				buffer[i][j] = ' ';	//creating buffer						
			}
			System.out.println(); 
		}
		plotTree(0, 34, 17, buffer );
		for(int i=0;i<10; i++){  
			for(int j=0;j<buffer[0].length;j++){  
				 System.out.print(buffer[i][j]); 							
			}
			System.out.println();
		}
	}
	
	private void plotTree(int level, int offset, int ref, char[][] buffer){
		if(this!=null){ 
			String num = Integer.toString(this.value);
			for(int i=0; i< num.length(); i++) 
				buffer[level][offset + i] = num.charAt(i); 		
			if(this.left!= null) { 
				buffer[level + 1][offset - ref/2 ] = '/';  
				this.left.plotTree(level+2, offset - ref, ref/2 , buffer);  
			} 
			if(this.right!=null){  
				buffer[level + 1][offset + ref/2 ] = '\\'; 
				this.right.plotTree(level+2, offset + ref, ref/2 , buffer); 
			}
		 }
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	public BinaryTree getRight() {
		return right;
	}
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.left = new BinaryTree(value);
	}
	
}
