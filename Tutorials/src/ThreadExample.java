import java.util.*;

//Runnable contains one method only and that is the run() method.
//build three objects that run on seperate threads.
public class ThreadExample implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public ThreadExample(String x){
		name = x;
		time = r.nextInt(999);
		
	}
	
	public void run(){
		try{
			
			System.out.printf("%s is running for %d\n" , name, time);
			Thread.currentThread().sleep(time);
			System.out.printf("%s has finished running\n", name);
		}catch(Exception e){
			
		}
	}
	

}
