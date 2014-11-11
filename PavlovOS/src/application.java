
public class application {
	
	public static void main(String[] args) {
		String input = "";
		
		applicationController controller = new applicationController();
		
		while(!input.equals("exit")) {
			
			// Get input
			
			// Handle input
			controller.handleCommand(input, null);
		}
	}

}
