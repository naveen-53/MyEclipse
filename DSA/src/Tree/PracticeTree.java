package Tree;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int d){
		this.data = d;
		left = null;
		right = null ;
	}
}

class BinaryTree1{
	
	Node1 root;
	BinaryTree1()	{	root = null;	}
	
	
	public void insert(int n) {
		root = insertRec(root,n);
	}
	private Node1 insertRec(Node1 root, int key) {
		if(root == null) {
			root = new Node1(key);
			return root;	
		}
		
		if(key < root.data) {
			root.left = insertRec(root.left,key);
		}
		else if(key>root.data) {
			root.right = insertRec(root.right,key);
		}
		
		return root;
	}
	
	public void inOrder() {
		
	}
	
	
}

public class PracticeTree {

	public static void main(String[] args) {
		
		BinaryTree1 b1 = new BinaryTree1();
		
		b1.insert(10);
		

	}

}
