
public interface Subject<T> {

	void addObserver(Observer<T> obs);
	
	void removeObserver(Observer<T> obs);
	
	void notifyObservers();
	
	T getState();
	
	void setState(T obj);
}
