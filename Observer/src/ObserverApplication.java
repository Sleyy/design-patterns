import java.util.Random;

public class ObserverApplication {

	public static void main(String[] args) {
		
		MySubject divideByThreeSubj = new MySubject();
		MySubject divideByFiveSubj = new MySubject();
		
		MyObserver myObs = new MyObserver();
		
		divideByThreeSubj.addObserver(myObs);
		divideByFiveSubj.addObserver(myObs);
		
		Random rand = new Random();
		Integer currentNum;
		for(Integer i = 0; i <= 50; i++) {
			currentNum = rand.nextInt(100);
			
			if(currentNum % 3 == 0) {
				divideByThreeSubj.setState(currentNum);
			}
			
			if(currentNum % 5 == 0) {
				divideByFiveSubj.setState(currentNum);
			}
		}
	}

}
