package bbbb;
import java.util.Scanner; 
import java.util.ArrayList;

public class PizzaProg {
	private int numPizza; private double total;

	static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
	static Scanner sc = new Scanner(System.in);

	public PizzaProg()
	{
	    numPizza = 1; 
	    total = 0;
	}

	private int getNumPizza() { return numPizza; }
	private void incNumPizza() { numPizza++; }

	public String toString()
	{
	    String output = "";
	    String pizzas = "";
	    for(Pizza p : pizzaList)
	    {
	        total += p.getPrice();
	        pizzas += "\t" + p + "\n";
	        
	    }
	    
	 /**   if (total<30)
	    {
	    	total=total+8;
	    }**/
	    return String.format("\n TotalCost: $%.2f\n", total) + pizzas;
	    
	    
	}

	public static void main(String[] args)
	{
	    boolean again = false;
	    PizzaProg pp = new PizzaProg();

	    System.out.println("Hello!  Welcome to Tony's Pizzeria!");
	    do
	    {
	        Pizza p = new Pizza();
	        pp.pizzaSize(p);
	        pp.pizzaToppings(p);
	        pizzaList.add(p);
	        System.out.print("Would you like to add another pizza to your order? (Y/N)  ");
	        if(sc.next().equalsIgnoreCase("y"))
	        {
	            pp.incNumPizza();
	            again = true;
	        }
	        else
	        {
	            System.out.println(pp);
	            again = false;
	        }
	    } while(again);
	    System.out.println("Come again soon!");
	}

	private void pizzaSize(Pizza p)
	{
	    System.out.println("Which size pizza do you want?");
	    System.out.println("1. SMALL");
	    System.out.println("2. MEDIUM");
	    System.out.println("3. LARGE");
	    System.out.println("4. COLLECTED");
	    System.out.println("5. DELIVERED");
	    System.out.println("6. DETAIL");
	    		
	 
	    switch(sc.nextInt())
	    {
	        case 1:
	        	p.setName("SMALL");
	            p.incPrice(Pizza.P_SMALL);
	            break;
	        case 2:
	        	 p.setName("MEDIUM");
	          p.incPrice(Pizza.P_MEDIUM);
	           break;
	        case 3:
	        	  p.setName("LARGE");
	          p.incPrice(Pizza.P_LARGE);
	         break;
	        case 4:
	        	  System.out.println("Enter Name");
	        	  String name=sc.next();
	        	  System.out.println("ADDRESS");
	        	  String address=sc.next();
	        	   
	        	break;
	        case 5:
	        	
	        	System.out.println("Enter Name:");
	        	  String Name=sc.next();
	        	  System.out.println("ADDRESS:");
	        	  String Address=sc.next();
	        	  System.out.println("Phone Number:");
	        	  int phone=sc.nextInt();
	        	   
	        	   
	        	
	    }
	}

	private void pizzaToppings(Pizza p)
	{
	    double[] toppingPrices = {Pizza.BACON, Pizza.OLIVES, Pizza.HAM, Pizza.MUSHROOMS, Pizza.PINEAPPLE, Pizza.SALAMI,Pizza.ANCHOVIES};
	    String[] toppingNames = {"BACON", "OLIVES", "HAM", "MUSHROOMS", "PINEAPPLE", "SALAMI","ANCHOVIES"};
	    System.out.print("Would you like toppings? (Y/N)  ");
	    if(sc.next().equalsIgnoreCase("y"))
	    {
	        p.concatName(" with ");
	        for(int i = 0; i < toppingPrices.length; i++)
	            pizzaTopping(p, toppingNames[i], toppingPrices[i]);
	    }
	}

	private void pizzaTopping(Pizza p, String topping, double price)
	{
	    System.out.print("Would you like " + topping + " on your pizza? (Y/N)  ");
	    if(sc.next().equalsIgnoreCase("y"))
	    {
	    	total=total+price;
	    //    p.incPrice(price);
	        p.concatName(topping + ", ");
	    }
	    
	    
	}
}


