
public class ChatUser extends User {

	public ChatUser(String name, MessageMediator mediator) {
		super(name, mediator);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
	}

}
