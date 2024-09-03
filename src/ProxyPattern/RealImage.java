package ProxyPattern;

public class RealImage implements IImage{
	private String name;
	
	public RealImage(String name) {
		this.name = name;
		loadFromDisk();
	}
	
	private static void loadFromDisk() {
		System.out.println("loading from disk");
	}
	
	@Override
	public void display() {
		System.out.println("displaying " + name);
	}

}
