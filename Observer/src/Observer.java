
public interface Observer<T> {

	void update();
	
	void setSubj(Subject<T> subj);
	
	void unsubscribe();
	
}
