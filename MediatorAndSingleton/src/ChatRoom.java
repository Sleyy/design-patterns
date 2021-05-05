import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements MessageMediator {
	
	private List<User> users;
	private ChatBot chatBot;
	
	public ChatRoom() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String message, User senderUser) {
		if(message.contains("addBot")) {
			chatBot = ChatBot.getInstance();
		}
		
		if(chatBot != null) {
			message = chatBot.filterMessage(message, senderUser, users);
		}
		
		for(User chatUser : users){
			if(chatUser == senderUser)
				continue;
			
			chatUser.receive(message);
		}
	}

}
