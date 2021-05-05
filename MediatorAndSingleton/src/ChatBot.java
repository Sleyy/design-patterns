import java.util.List;

public class ChatBot {

	private static ChatBot instance;
	
	private ChatBot() {
	}
	
	public static ChatBot getInstance() {
		if(instance == null) {
			instance = new ChatBot();
		}
		
		return instance;
	}
	
	public String filterMessage(String message, User senderUser, List<User> userPool) {
		if(!message.contains("cat"))
			return message;
		
		userPool.remove(senderUser);
		return  senderUser.name  + " has been kicked out of the room. The word \"cat\" is forbidden!";	
	}

}
