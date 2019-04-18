package a02;

public class Berechne extends Thread {
	F function;
	int n;
	public Berechne(F _f, int _n) {
		this.function = _f;
		this.n = _n;
	}
	
	public void run() {
		System.out.println(function.f(n));
	}
}