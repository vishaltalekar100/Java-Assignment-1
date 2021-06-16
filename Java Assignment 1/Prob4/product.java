import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class product 
{	
	Scanner sc=new Scanner(System.in);
	List<String> cart=new ArrayList<String>();

	int price=0;

	public void Electronics()
	{
		System.out.println("1.iPhone 12- Rs.77500\n"
				+ "2.Samsung TV - Rs.20000\n"
				+ "3.Boat Hedphone - Rs.5000");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("iPhone");
			price=price+77500;
			break;
		case 2:
			cart.add("Samsung TV");
			price=price+20000;
			break;
		case 3:
			cart.add("Boat Headphone");
			price=price+5000;
			break;
        }
		return ;
	}
	public void Books()
	{
		System.out.println("1.Harry Potter - Rs.500\n"
				+ "2.Dictionary- Rs.600\n"
				+ "3.Alchemist- Rs.300");
		
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Harry Potter");
			price=price+500;
			break;
		case 2:
			cart.add("Dictionary");
			price=price+600;
			break;
		case 3:
			cart.add("Alchemist");
			price=price+300;
			break;
        }
		return ;
	}
	public void Grocery()
	{
		System.out.println("1.Dal Rs.100\n"
				+ "2.Tea- Rs.58\n"
				+ "3.Sugar Rs.50");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Dal");
			price=price+100;
			break;
		case 2:
			cart.add("Tea");
			price=price+58;
			break;
		case 3:
			cart.add("Sugar");
			price=price+50;
			break;
        }
		return ;
	}
	public void Toy_Games()
	{
		System.out.println("1.Car - Rs.1200\n"
				+ "2.Doll- Rs.400\n"
				+ "3.Bat- Rs.800");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("car");
			price=price+1200;
			break;
		case 2:
			cart.add("Doll");
			price=price+400;
			break;
		case 3:
			cart.add("Bat");
			price=price+800;
			break;
        }

		return ;
	}
	public void Beauty()
	{
		System.out.println("1.Facewash- Rs.200\n"
				+ "2.Lipstick - Rs.150\n"
				+ "3.Eye-liner - Rs.400");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Facewash");
			price=price+200;
			break;
		case 2:
			cart.add("Lipstick");
			price=price+150;
			break;
		case 3:
			cart.add("Eye-Liner");
			price=price+400;
			break;
        }
		return ;
	}
	public void Jwellery()
	{
		System.out.println("1.Ring- Rs.77500\n"
				+ "2.Bangles- Rs.20000\n"
				+ "3.Neckless- Rs.500000");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Ring");
			price=price+77500;
			break;
		case 2:
			cart.add("Bangles");
			price=price+20000;
			break;
		case 3:
			cart.add("Neackless");
			price=price+500000;
			break;
        }
		return ;
	}
	public void Clothing()
	{
		System.out.println("1.Shirt- Rs.500\n"
				+ "2.Pant - Rs.2000\n"
				+ "3.Saree - Rs.1100");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Shirt");
			price=price+500;
			break;
		case 2:
			cart.add("Pant");
			price=price+2000;
			break;
		case 3:
			cart.add("Saree");
			price=price+1100;
			break;
        }

		return ;
	}
	public void Home_Kitchen()
	{
		System.out.println("1.Bowls- Rs200\n"
				+ "2.Spoons - Rs.150\n"
				+ "3.Knife - Rs.40");
		int choice=sc.nextInt();
		switch(choice)
        {
		case 1:
			cart.add("Bowls");
			price=price+200;
			break;
		case 2:
			cart.add("Spoons");
			price=price+150;
			break; 
		case 3:
			cart.add("Knife");
			price=price+40;
			break;
        }
		return ;
	}
	
	public int getPrice()
	{
		return price;
	}
	public ArrayList getCart()
	{
		return (ArrayList) cart;
	}
	

}
