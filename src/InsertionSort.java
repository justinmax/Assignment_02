import java.util.Scanner;


public class InsertionSort {
	 public static void main(String []args) {
		    int n, i, j, temp;
		    Scanner sort = new Scanner(System.in);
		 
		    System.out.println("Input the integers to sort");
		   n = sort.nextInt();
		   int a[] = new int[n];
		   System.out.println("Enter " + n + " integers");
		   for (i = 0; i < n; i++) 
		    a[i] = sort.nextInt();
		  
		   
		   for(i = 1;i<n;i++)
		   {
			   for(j=i;j>0;j--)
			   {
				   if(a[j] < a[j-1])
				   {
				   temp  = a[j];
				   a[j] = a[j-1];
				   a[j-1]  = temp;
				   }
			   }
		   }
		   for(i  = 0;i<n ; i++)
		   {
			   System.out.println(a[i]);
		   }

}
}
