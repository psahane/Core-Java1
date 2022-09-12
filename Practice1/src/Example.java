import java.util.Arrays;

public class Example {

	static  void sort(String s[], int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	        int j = i - 1;
	        while (j >= 0 && temp.length()<s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}
	  static void printString(String str[], int n)
	{
	    for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}
	 
	public static void main(String args[])
	{
	    String arr[] = {"pravin","sahne","kale","dipak"};
	    int n = arr.length;
	    sort(arr,n);
	    printString(arr, n);
	     
	}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//   String str[]= {"pravin","sahne","kale","dipak"};
//   // output kale,dipak,sahne, pravin;
//   
//    System.out.println("original String is"+Arrays.toString(str));
//    Arrays.sort(str);
//    System.out.println(Arrays.toString(str));
//    
//    }

