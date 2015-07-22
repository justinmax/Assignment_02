import java.util.Scanner;
public class QuickSort {
	 public static void sort(int[] a)
	    {
	        quicksort(a, 0, a.length - 1);
	    }
	 public static void main(String[] args)
	 {
		 int n;
	   Scanner sort = new Scanner(System.in);						
	   System.out.println("Input the integers to sort");
	   n = sort.nextInt();
	   int a[] = new int[n];
	   System.out.println("Enter " + n + " integers");
	   for (int i = 0; i < n; i++) 
	    a[i] = sort.nextInt();
	   int low = 0;
	   int high = a.length - 1;
	   sort(a);
	   System.out.println("\nElements after sorting ");        
       for (int i = 0; i < n; i++)
           System.out.print(a[i]+" ");      
	  
	  }
	private static void quicksort(int[] a, int low, int high) {
		if(a == null || a.length == 0)
			return;
		if(low >= high)
			return;
		
		int mid = low +(high - low)/2;//pivot element
		int key = a[mid];
		int i = low, j = high;
		while (i <= j) {
			while (a[i] < key) {// making the elements go left 
				i++;
			}
 
			while (a[j] > key) {// making the elements go right
				j--;
			}
 
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(a, low, j);
 
		if (high > i)
			quicksort(a, i, high);
		
	}
	}
	
	
