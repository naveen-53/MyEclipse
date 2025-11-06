package ThreadTopic;

//Thread -- process(init(),start(), stop(),service() -- run(),destroy(),sleep(),
	//notify(),notifyAll()
	//Thread --- task(timebound) --- sleep(ms),wait(),await()
	//1.extends Thread (class)
	//2. implements runnable(interface)

public class ThreadProgram extends Thread {

	public static void main(String[] args) {
		ThreadProgram tp = new ThreadProgram();
		tp.start(); //thread starts
		
		System.out.println("The code is outside the thread");
	}
		
		public void run() { // once thread started enters into run()
			
			System.out.println("The code is running in the thread");
		}
	
		

}
