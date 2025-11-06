package ThreadTopic;

public class ThreadPrirority {

	public static void main(String[] args) {
		
		Thread ex1 = new Thread("Demo");
		Thread ex2 = new Thread("Demo2");
		ex1.start(); // priority thread (ex1) -- min
		ex2.start(); // pt1 (ex2) -- max
		System.out.println("Thread name are as follows");
		System.out.println(ex1.getName());
		System.out.println(ex2.getName());

	}
	public void run() {
		
	}

}
