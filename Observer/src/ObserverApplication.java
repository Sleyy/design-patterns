
public class ObserverApplication {

	public static void main(String[] args) {
		observeNumbers();
		observeStrings();
	}

	public static void observeNumbers() {
		MySubject<Integer> subjA = new MySubject<Integer>();

		MyObserver<Integer> obsA = new MyObserver<Integer>();
		MyObserver<Integer> obsB = new MyObserver<Integer>();

		subjA.addObserver(obsA);
		subjA.addObserver(obsB);

		for (Integer i = 0; i <= 15; i++) {
			subjA.setState(i);
		}

		obsA.unsubscribe();
		obsA.unsubscribe();
	}

	public static void observeStrings() {
		MySubject<String> subjA = new MySubject<String>();

		MyObserver<String> obsA = new MyObserver<String>();
		MyObserver<String> obsB = new MyObserver<String>();

		subjA.addObserver(obsA);
		subjA.addObserver(obsB);

		subjA.setState("First");
		subjA.setState("Second");
		subjA.setState("Third");
		subjA.setState("Etc..");
		
		subjA.removeObserver(obsA);
		subjA.removeObserver(obsB);
	}
}
