
public class MediatorAndSingletonMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new ChatRoom();
		
		User userA = new ChatUser("Ivan", chat);		
		User userB = new ChatUser("Petar", chat);
		User userC = new ChatUser("Maria", chat);

		
		userB.send("cat");
		
		userC.send("let's addBot");
		
		userA.send("what about cat's?");
	}

}
