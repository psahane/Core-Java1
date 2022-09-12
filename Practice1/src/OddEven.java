import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 10 no");
     int arr[]=new int[10];
     for(int i=0;i<10;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     int  even=0,odd=0;
     for(int i=0;i<10;i++)
     {
    	 if(arr[i]%2==0)
    	 {
        even++;
        
    	 }
    	 else
    		 odd++;
    	 System.out.println(arr[i]+" ");
     }
     System.out.println("even no is:"+even);
     System.out.println("odd no is:"+odd);
    		 
	}

}
