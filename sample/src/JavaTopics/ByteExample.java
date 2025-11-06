package JavaTopics;

public class ByteExample {

	public static void main(String[] args) {
		// create byte ASCII Array
		byte ascii[]= {70,71,70};
		
		//create String using byte array
		String firstString=new String(ascii);
		System.out.println(firstString);
		
		String secondString=new String(ascii,1,2);
		System.out.println(secondString);
		

	}

}
