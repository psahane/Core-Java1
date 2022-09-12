/*
 * 2.	Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. Create getter, setter methods for the variables. In main method,
1>	create Laptop object 
2>	set values of variables noOfUSBPort, processorSpeed using setter methods. 
3>	print variables noOfUSBPort, processorSpeed using getter methods.


 */

package Assingment6;

import java.util.Scanner;

public class LaptopMain  extends Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the noOfUSBPort,processorSpeed");
			int noOfUSBPort=sc.nextInt();
			int processorSpeed=sc.nextInt();
			Laptop l=new Laptop();
			l.setNoOfUSBPort(noOfUSBPort);
			l.setProcessorSpeed(processorSpeed);
			
			System.out.println("noOfUSBPort= "+l.getNoOfUSBPort()+" "+"processorspeed= "+l.getProcessorSpeed()+" Hz");
			sc.close();
		}
		

	}


