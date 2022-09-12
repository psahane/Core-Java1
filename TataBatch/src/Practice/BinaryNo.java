package Practice;

import java.util.Scanner;

public class BinaryNo {
	

	static void decToBinary(int n)
    {
        
        int[] binaryNum = new int[1000];
   
        
        int i = 0;
        while (n > 0) 
        {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
   
        
        for (int j = i - 1; j >= 0; j--)
        	
            System.out.print(binaryNum[j]);
    }
      
    
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the no ");
        int n = sc.nextInt();
       
      
        System.out.print("Binary no is : ");
          decToBinary(n);
    }
}


