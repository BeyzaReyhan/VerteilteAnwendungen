package a02;
import java.util.ArrayList;
import java.util.List;

public class Results {
	public static List<Integer> resultList = new ArrayList<Integer>();
	
	//Die Methode insert legt die Ergebnisse in die resultList rein.
	public synchronized void insert(int e, int count) {
		
		
		resultList.add(e);
		if(resultList.size() == count) {
			notifyAll();
		}
	}
	
	public synchronized void outputResults() {
		try {
			while (resultList.size() != 0)
			wait();
			for(int i = 0; i < resultList.size(); i++) {
				System.out.println(resultList.get(i));
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}