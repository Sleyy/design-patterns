import java.util.ArrayList;

public class MySubject<T> implements Subject<T> {

	private ArrayList<Observer<T>> observers;
	private T stateObj;

	public MySubject() {
		this.observers = new ArrayList<Observer<T>>();
	}

	@Override
	public void addObserver(Observer<T> obs) {
		this.observers.add(obs);
		obs.setSubj(this);
	}

	@Override
	public void removeObserver(Observer<T> obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer<T> obs : this.observers) {
			obs.update();
		}
	}

	@Override
	public T getState() {
		return this.stateObj;
	}

	@Override
	public void setState(T obj) {
		this.stateObj = obj;
		this.notifyObservers();
	}

}
