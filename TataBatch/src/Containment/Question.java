package Containment;

public class Question {

	int qid ;
	String qname;
	
	public void setQId(int qId)
	{
		this.qid=qId;
	}
	void setQName(String q)
	{
		this.qname=q;
	}
	public String toString()
	{
		return "Question\n"+qid+" "+qname; 
			
	}
	
}
