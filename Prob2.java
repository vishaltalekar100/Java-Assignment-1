import java.util.*;

public class Prob2{

	public static void main(String[] args){
	
       Scanner sc=new Scanner(System.in);
       boolean ans=false;
       System.out.println("Enter the number :");
       int n=sc.nextInt();
       
       while(n>=9)
       {
    	   n=n/9;
    	   if(n==1)
    		   ans=true;
       }

       if(ans==true)
       System.out.println("true");
       else
       System.out.println("false"); 
       
	}

}