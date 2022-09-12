package Practice;

public class FindPair {
   
	public static void main(String args[])
	    {
	        int[] arr = {5,4,7,8,10,9,15};
	        int sum = 25;
	        getPairsCount(arr, sum);
	    }
	 
	    
	    public static void getPairsCount(int[] arr, int sum)
	    {
	 
	         for (int i = 0; i < arr.length; i++) 
	        	
	        
	            for (int j = i + 1; j < arr.length; j++)
	            
	                if ((arr[i] + arr[j]) == sum)
	               
	                    
	                
	           
			System.out.printf(arr[i] + " "+arr[j]);
	    }
	}
