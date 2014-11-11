import java.util.HashMap;


public interface Handler {
	void handleCommand(HashMap<String, Object> data);
}
