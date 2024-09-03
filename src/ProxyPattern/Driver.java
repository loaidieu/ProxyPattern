package ProxyPattern;

public class Driver {

	public static void main(String[] args) {
		System.out.println("eager initialization");
		RealImage image = new RealImage("Too sweet");
		image.display();
		
		System.out.println("Proxy approach");
		IImage proxy = new ProxyImage("Too sweet");
		System.out.println("12 hours passed");
		proxy.display();
	}

}
