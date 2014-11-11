
public class ThreadTest {

	public static void main(String[] args) {
		
		//cannot use the thread example class unless the ThreadExample class implements runnable.
		Thread thread1 = new Thread(new ThreadExample("Timer1"));
		thread1.start();
		
		Thread thread2 = new Thread(new ThreadExample("Timer2"));
		thread2.start();
		
		Thread thread3 = new Thread(new ThreadExample("Timer3"));
		thread3.start();
		
		Thread thread4 = new Thread(new ThreadExample("Timer4"));
		thread4.start();
		
	}

}
