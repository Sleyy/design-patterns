
public abstract class User {

	protected String name;
	protected MessageMediator mediator;

	public User(String name, MessageMediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public abstract void send(String message);

	public abstract void receive(String message);
}
