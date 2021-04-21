
public class MyObserver<T> implements Observer<T> {
	
	private Subject<T> subj;
	
	@Override
	public void update() {
		System.out.println("The new state is: " + subj.getState());
	}

	@Override
	public void setSubj(Subject<T> subj) {
		this.subj = subj;
	}

	@Override
	public void unsubscribe() {
		this.subj.removeObserver(this);
	}

}
