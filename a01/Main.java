package a01;

public class Main {

	public static void main(String[] args) {
		eieruhr();
	}
	
	static void eieruhr() {
		Eieruhr a = new Eieruhr(20, "Uhr1");
		Eieruhr b = new Eieruhr(120, "Uhr2");
		Eieruhr c = new Eieruhr(210, "Uhr3");
		a.start();
		b.start();
		c.start();
	}

}