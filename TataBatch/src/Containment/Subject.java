package Containment;

public class Subject {
  int sid;
  String sname;
  Topic t;
  
  
  public void setSid(int i)
  {
	  this.sid=i;
  }
  public void setSname(String n)
  {
	  this.sname=n;
  }
  public void setT(Topic t)
  {
	  this.t=t;
	  
  }
  public String toString()
  {
  	return "Student\n"+sid+" "+sname+" "+t;
  	}
  
}
