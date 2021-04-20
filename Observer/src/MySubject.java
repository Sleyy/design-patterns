import java.util.ArrayList;

public class MySubject implements Subject {

	private ArrayList<Observer> observers;
	private Integer number;

	public MySubject() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer obs) {
		this.observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : this.observers) {
			obs.update(this);
		}
	}

	@Override
	public Integer getState() {
		return this.number;
	}

	@Override
	public void setState(Integer num) {
		this.number = num;
		this.notifyObservers();
	}

}
