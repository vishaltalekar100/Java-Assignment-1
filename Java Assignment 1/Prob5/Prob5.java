import java.util.*;
import java.util.Arrays;

public class Prob5{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array 1 : ");
		int ln1=sc.nextInt();
		int[] arr1=new int[ln1];
		System.out.println("Enter the elements in Array 1 : ");
		for(int i=0;i<ln1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Array 2 : ");
		int ln2=sc.nextInt();
		int[] arr2=new int[ln2];
		System.out.println("Enter the elements in Array 2 : ");
		for(int i=0;i<ln2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] result = new int[ln1 + ln2]; 
		System.arraycopy(arr1, 0, result, 0,ln1);  
		System.arraycopy(arr2, 0, result,ln1,ln2);  
		
		System.out.println("Array after merging two arrys is : ");
		for(int i=0;i<ln1+ln2;i++)
			System.out.print(" "+result[i]);

				
		Arrays.sort(result);
		
		System.out.println("\nSorted Array is : ");
		for(int i=0;i<ln1+ln2;i++)
		   System.out.print(" "+result[i]);


	}

}