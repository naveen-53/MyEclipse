package Test;

import java.util.ArrayList;

public class MultiplesofTen {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		int i=10;
		while(i!=1010) {
			al.add(i);
			i+=10;
		}
		System.out.println(al);

	}

}
