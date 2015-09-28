package bbbb;

public class Pizza {
	//pricing of pizzas 
	final static int P_SMALL = 50;
final static 	int P_MEDIUM = 8; 
	final static int P_LARGE = 12;
	// pricing of toppings 
	final static double BACON = 1; 
	final static double OLIVES = 1; 
	final static double HAM = 1; 
	final static double MUSHROOMS = 1; 
	final static double PINEAPPLE= 1; 
	final static double SALAMI = 1;
	final static double ANCHOVIES = 1;

	private double price;
	private String name;

	public Pizza()
	{
	    price = 0;
	    name = "";
	}

	public double getPrice()
	{
		return price; 
		}
	public void incPrice(double p)
	{ 
		price = p; 
		}

	public void setName(String s) 
	{ 
		
		name = s; 
		}
	public void concatName(String s) {
		name += s; 
		}

	public String toString()
	{
	    return name.substring(0,name.length());
	}
}
