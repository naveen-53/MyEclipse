package Tree;

import java.util.Scanner;

import BinarySearchTree.BST;

public class MainTreeDemo {

	public static void main(String[] args) {
		
		BST b = new BST();
		
		int nums[] = {5,3,2,7,8,10,15,12,6,4,1};
		
		b.populate(nums);
		
		b.display();
		System.out.println(b.balanced());
	}

}
