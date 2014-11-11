public class SingletonLog {

	private static SingletonLog Logger;
	
	private SingletonLog(){}
	
	public static SingletonLog GetInstance() {
		if (null == Logger ){
			Logger = new SingletonLog();
		}
		return Logger;
	}
	
	public void WriteMessage(String msg){
		System.out.println(msg);
	}
	
}
