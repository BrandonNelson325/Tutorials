import java.util.HashMap;
import java.util.Map;


public class applicationController {
	
	Map<String, Handler> handles = new HashMap<String, Handler>();
	
	applicationController() {
		this.handles.put("do something", new DoSomethingHandler());
		this.handles.put("punish", new PunishHandler());
		this.handles.put("reward", new RewardHandler());
	}
	
	void handleCommand(String aCommand, HashMap<String, Object> data) {
		if (this.handles.containsKey(aCommand)) {
			this.handles.get(aCommand).handleCommand(data);
		} else {
			// We got a bad command
		}
	}

}
