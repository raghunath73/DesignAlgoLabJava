package daalab;
import java.util.Arrays;//to use sort method
import java.util.Scanner;
public class BinarySearch
{
   public static void main(String[] args)
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number of elements : ");
	 int n = sc.nextInt();
	 System.out.println("Enter the elements : ");
	 int ar[] = new int[n];
	 for(int i=0;i<n;i++)
		 ar[i]=sc.nextInt();
	 System.out.println("Enter element to search : ");
	 int key = sc.nextInt();

	 System.out.println("Elements in the array : ");
	 for(int i=0;i<n;i++)
		 System.out.print(ar[i]+" ");
	 System.out.println();
	 Arrays.sort(ar);
	 int res = search(ar,key,0,n-1);
	 if(res==-1)
		 System.out.println("\n"+key+" not found!!");
	 else
		 System.out.println("\n"+key+" found in the array ");
	 sc.close();
   }
   public static int search(int a[],int key,int lb,int ub)
   {
	   if(lb<=ub)
	   {
		   int mid = (lb+ub)/2;
		   if(a[mid]==key)
			   return mid;
		   else if(key<a[mid])
			   return search(a,key,lb,mid-1);
		   else
			  return search(a,key,mid+1,ub);
	   }
		   
	   return -1;
   }
}
