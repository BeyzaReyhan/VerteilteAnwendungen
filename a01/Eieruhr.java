package a01;

public class Eieruhr extends Thread {
	int time;
	String name;
	public Eieruhr(int t, String n) {
		time = t;
		name = n;
	}
	
	public void run() {
		try {
			for (int j = time; j > -1; j--){
				Thread.sleep(1000);
				System.out.println( name+ " " + j + " ");
				}
			}catch(InterruptedException t) {
				
			}
		}
}