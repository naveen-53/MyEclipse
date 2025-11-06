package ThreadTopic;

class ThreadImpl{
	private boolean exit1;
	private String name;
	Thread t;
	
	ThreadImpl(String threadname){
		name=threadname;
		t=new Thread(this.name);
		System.out.println("New Thread "+t);
		exit1=false;
		t.start();
	}
	
	public void run() {
		int i=0;
		while(!exit1) {
			System.out.println(name+" : "+i);
			i++;
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("caught "+e);
			}
		}
		
		System.out.println(name+" stopped");
	}
	
	public void stop() {
		exit1=true;
	}
}

public class ThreadImplementation {
	public static void main(String[] args) {
		ThreadImpl t1= new ThreadImpl("First Second");
		ThreadImpl t2= new ThreadImpl("Second Second");
		
		
		try {
			Thread.sleep(200);
			t1.stop();
			t2.stop();
			Thread.sleep(200); // note thread only can specify the sleep time
		}
		catch(Exception e) {
			System.out.println("Caught "+e);
		}
		System.out.println("Exit the main thread");

	}

}
