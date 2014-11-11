import java.util.HashMap;


public class DoSomethingHandler implements Handler {

	@Override
	public void handleCommand(HashMap<String, Object> data) {
		// This one is responsible for doing something
		System.out.println("I'm doing something!");
	}
	
}
