package Assingment6;

   class Father {

	
	    public void house()
	    {
	        System.out.println("2BHK House.");
	    }
	}
	class Son extends Father 
	{
	    public void car()
	    {
	        System.out.println("Audi Car.");
	    }
	}
	 
          class Single {
	    public static void main(String args[])
	    {
	        Son o =new Son();
	        o.car();
	        o.house();
	    }
	}

