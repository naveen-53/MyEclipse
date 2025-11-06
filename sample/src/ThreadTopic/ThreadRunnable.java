package ThreadTopic;

class Book implements Runnable{
	
	public void run() {
		System.out.println("do a task");
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Book(), "book thread");
		t1.start();
		System.out.println("Thread with name "+t1.getName());
		

	}

}
