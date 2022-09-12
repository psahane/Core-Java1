
public class interview
{
public static void main(String[] args) 
	{
	     int a[]= {5,2,7,3,9};
         int b[]= {55,45,35,25,15};
         int c[]= new int[a.length+b.length];
         int i=0, j=0,k=0;

         j=b.length-1;
         while (i<a.length && j>=0){
         c[k]=a[i];
         k++;
         i++;
         c[k]=b[j];
         k++;
         j--;
         }
         for ( k=0; k<c.length; k++ )
         {
         System.out.print(c[k]+" ");     
         }

	}
}