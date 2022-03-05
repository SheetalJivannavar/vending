
public enum Item {
	Twix("Twix", 25), Snickers("Snickers", 35), Skittles("Skittles", 45);
	private String name;
	private int price;
	private Item(String name, int price)
	{
	this.name = name; 
	this.price = price;
	} 
	public String getName()
	{
		return name; 
	} 
	public long getPrice()
	{ 
		return price;
	}


}
