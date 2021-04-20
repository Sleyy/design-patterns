
public class MyObserver implements Observer {

	@Override
	public void update(Subject subj) {
		System.out.println("The magic number is: " + subj.getState());
	}

}
