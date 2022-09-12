
public class BappaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j = 1; j <= 3; j++)  
        {  
            for(int k = 1; k <= 11-j+1; k++)  
            {  
                System.out.print(" ");  
            }  
            for(int k = 1; k <= ((j*j)+2-j)/2; k++)  
            {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
		for(int j = 1; j <= 3; j++)  
        {  
            for(int k = 1; k <= 2*(4-j+1); k++)  
            {  
                System.out.print(" ");  
            }  
            for(int k = 1; k <= 2+(4*j); k++)  
            {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
	}

}
