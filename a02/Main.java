package a02;

public class Main {

	public static void main(String[] args) {
		//Wegen dem int x in der Klasse F.java
		F function = new F(){public int f(int x) {return x+10;}};
		
		execute(function, 5);
	}
	
	public static void execute(F _function, int _n) {
		//hier werden die Ergebnisse von der Gleichung gespeichert.
		Results resultList = new Results();
		
		for(int i = 0; i <= _n - 1; i++){
			final int innerI = i;
			//hier wird ein neuer Thread erstellt : 
			new Thread(new Runnable()
			{
				public void run() 
				{
					resultList.insert(_function.f(innerI), _n);
				}
				
			}).start();
		}
		resultList.outputResults();
	}
}