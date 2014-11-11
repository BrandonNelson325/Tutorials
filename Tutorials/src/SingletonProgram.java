

public class SingletonProgram {

	public static void main(String[] args) {
		
		SingletonLog theLogger = SingletonLog.GetInstance();
		theLogger.WriteMessage("YO IM THE BEST CUZ THIS WORKED!");

	}

}