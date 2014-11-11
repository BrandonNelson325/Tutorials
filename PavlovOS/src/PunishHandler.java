import java.util.HashMap;


public class PunishHandler implements Handler{

	@Override
	public void handleCommand(HashMap<String, Object> data) {
		// This command punishes pavlovOS for doing something bad.
		System.out.println("OWWW!");
		
	}

}
