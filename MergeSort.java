import java.util.Scanner;
public class MergeSort
{
   public static void divide(int arr[],int si,int ei)
   {
	   if(si>=ei)
	   {
		   return;
	   }
	   int mid = si+(ei-si)/2;
	   divide(arr,si,mid);
	   divide(arr,mid+1,ei);
	   conquer(arr,si,mid,ei);
   }
   public static void conquer(int arr[],int si,int mid,int ei)
   {
	  int merged[] = new int[ei-si+1];
	  int indx1 = si;
	  int indx2 = mid+1;
	  int x = 0;
	  while(indx1<=mid&&indx2<=ei)
	  {
		  if(arr[indx1]<=arr[indx2])
			  merged[x++]=arr[indx1++];
		  else
			  merged[x++]=arr[indx2++];
	  }
	  while(indx1<=mid)
		  merged[x++]=arr[indx1++];
	  while(indx2<=ei)
		  merged[x++]=arr[indx2++];
	  for(int i=0,j=si;i<merged.length;i++,j++)
		  arr[j]=merged[i];
   }
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number of elements in the array : ");
	   int n = sc.nextInt();
	   System.out.println("Enter the elements : ");
	   int arr[] = new int[n];
	   for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	   System.out.println("Elements before sorting : ");
	   for(int i=0;i<n;i++)
		   System.out.print(arr[i]+" ");
	   divide(arr,0,n-1);
	   System.out.println("\nElements after sorting : ");
	   for(int i=0;i<n;i++)
		   System.out.print(arr[i]+" ");
	   sc.close();
   }
}
