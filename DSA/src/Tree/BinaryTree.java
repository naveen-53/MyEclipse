package Tree;

import java.util.Scanner;

public class BinaryTree {
	Node root;
	
	BinaryTree(int d){	
	}
	
	class Node{
		int data;
		Node right,left;
		
		Node(int d){
			
			this.data=d;
			right =null;
			left = null;
		}	
	}
	
	public void addTreeData(Scanner scanner) {
		System.out.println("Enter the root value: ");
		int value = scanner.nextInt();
		root = new Node(value);
		addTreeData(scanner,root);	
	}
	
	public void addTreeData(Scanner scanner, Node node) {
		
		System.out.println("Do you Want to enter left value:");
		boolean left = scanner.nextBoolean();
		
		if(left) {
			System.out.println("Enter the left value of "+node.data);
			int value = scanner.nextInt();
			node.left= new Node(value);
			addTreeData(scanner,node.left);
		}
		
		System.out.println("Do you Want to enter right value:");
		boolean right = scanner.nextBoolean();
		
		if(right) {
			System.out.println("Enter the right value of "+node.data);
			int value = scanner.nextInt();
			node.right= new Node(value);
			addTreeData(scanner,node.right);
		}
	}
}
