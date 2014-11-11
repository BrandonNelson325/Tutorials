import java.util.HashMap;


public class RewardHandler implements Handler {

	@Override
	public void handleCommand(HashMap<String, Object> data) {
		// This handler rewards PavlovOS for doing something right.
		System.out.println("COOKIES!!!");
	}

}
