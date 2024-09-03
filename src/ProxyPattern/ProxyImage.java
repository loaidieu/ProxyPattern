package ProxyPattern;

public class ProxyImage implements IImage{
	private String name;
	private IImage image;
	
	public ProxyImage(String name)
	{
		this.name = name;
	}
	@Override
	public void display() {
		if(image == null)
		{
			image = new RealImage(name);
		}
		image.display();
	}

}
