package Day1;
import java.util.Scanner;
public class simpleintrest 
{
	public static void main(String[] args) {
		float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the principle : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        
       float si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
		
		
	}


