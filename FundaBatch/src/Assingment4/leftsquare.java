
//4.	WAP to replace all negative value with its immediate left elements square. 
//        Means arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9]
//       Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].


package Assingment4;

public class leftsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12, 3, -19, 29, 5, -61, 44, 7, -9 };
	     int s=a.length;
	     
	     for(int i=0;i<a.length;i++)
	       {
	         
	        
	      if (a[i]<0)
	       {
	         a[i]=a[i-1]*a[i-1];
	          
	        }
	      }
	       
	      for(int i=0;i<a.length;i++)
	       {
	         
	           System.out.println(a[i]+"  ");
	}
	}
	}


