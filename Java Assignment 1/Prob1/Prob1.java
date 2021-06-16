import java.util.*;

public class Prob1{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		float sum = 0;
		float tax = 0;
		System.out.println("Enter no. of Items :");
		int items = sc.nextInt();

		for(int i=1;i<=items;i++){

		   System.out.println("Enter the price of item "+i +" :");
		   float price = sc.nextFloat();
		   

		   if(price>=0 && price<100)
           tax=(float) price*0;
           else if(price>=100 && price<1000)
           tax=(float) (price*0.05);
           else if(price>=1000 && price<10000)
           tax=(float) (price*0.1);
           else if(price>=10000 && price<100000)
           tax=(float) (price*0.2);
           else if(price>=100000)
           tax=(float) (price*0.3);

		   sum = sum + tax;
		}
		
        System.out.println("Tax Amount is = " +Math.round(sum));

      }

}