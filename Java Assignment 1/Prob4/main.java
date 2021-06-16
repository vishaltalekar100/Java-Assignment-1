import java.util.List;
import java.util.Scanner;

public class main 
{
   public final static String email="abc@gmail.com";
   public final static String password="abc@456";

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		product pr=new product();
		char repeat;
		do {
		System.out.println("Select Category :");
		System.out.println("1.Electronics   2.Books");
		System.out.println("3.Grocery       4.Toy and Games");
		System.out.println("5.Beauty        6.Jwellery");
		System.out.println("7.Clothing      8.Home and Kitchen");
		System.out.println("Enter your Choice no. ");
		
		int cat=sc.nextInt();
		System.out.println("select your product :");
		switch(cat)
        {
		case 1:
			pr.Electronics();
			break;
		case 2:
			pr.Books();
			break;
		case 3:
			pr.Grocery();
			break;
		case 4:
			pr.Toy_Games();
			break;
		case 5:
			pr.Beauty();
			break;
		case 6:
			pr.Jwellery();
			break;
		case 7:
			pr.Clothing();
			break;
		case 8:
			pr.Home_Kitchen();
			break;
		
		}
		
		System.out.println("want to buy more , press y");
		System.out.println("To checkout, press c");
		repeat=sc.next().charAt(0);
		
		}while(repeat=='y');
		
		List<String> shopping=pr.getCart();
		System.out.println("Products in your cart are :");
		System.out.println(shopping);

		int pay=pr.getPrice();
		System.out.println("Amount to pay is = Rs. "+pay);
		
		System.out.println("Enter email");
		String e=sc.next();
		System.out.println("Enter password");
	    String p=sc.next();
	    
	    if(e.equals(email) && p.equals(password))
	    {
	    	System.out.println("Log in Successful !");
	    	System.out.println("Enter address");
	    	String add=sc.next();
	    	System.out.println("Order Placed !");
	    }
	    else
	    {
	    	System.out.println(" Sorry ! credentials are not valid");
	    }

	}

}