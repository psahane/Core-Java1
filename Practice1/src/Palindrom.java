import java.util.Scanner;

public class Palindrom {

	
	 int n,a,rev=0,rem=0;
     
     public void input()
     {
         Scanner x= new Scanner(System.in); 
           System.out.println("Enter no:");
             a=x.nextInt();
     }
     
    public void check()
     {
        n=a;
         while(a>0)
      {
      rem=a%10;
      rev=(rev*10)+rem;    
      a=a/10;
     }
            
      if(n==rev){
         System.out.println("  No is palindrome");
           }
     else 
         {
        System.out.println("No is not Palindrome");
         }
             
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom p= new Palindrom();
	            p.input();
	            p.check();
	}

}
