package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class NoOfOccurance {
     ArrayList<Integer> l = new ArrayList<>();
	 public  void addElement()
	 {
	       
	        l.add(12);
	        l.add(13);
	        l.add(15);
	        l.add(12);
	        l.add(15);
	        l.add(15);
	        l.add(35);
	        l.add(11);
	        l.add(10);
	        System.out.println(l);
	      
	    }
	 public void showOcurance()
	 {
		 Iterator<Integer> i=l.iterator();
		 for(int i1=0;i1<l.size();i1++)
		 {
			if(l.get(i1)==-1)
			continue;
			int  cnt=1;
			for(int j=0;j<l.size();j++)
			{
				if(l.get(i1)==l.get(j))
				{
					cnt++;
				l.set(j,1);
				}
			}
		 
		 System.out.println(l.get(i1)+"occure"+cnt);
	 }
	 }
	        
	      
	    public static void main(String[] args) {
	   
	    	 NoOfOccurance o=new  NoOfOccurance();
	    	 o.addElement();
	    
	    	 o.showOcurance();
	    	 
}
}