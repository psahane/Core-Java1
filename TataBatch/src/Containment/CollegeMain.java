package Containment;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Question q=new Question();
     q.setQId(1);
     q.setQName("what is containment");
     
     SubTopic s=new SubTopic();
     s.setStId(1);
     s.setStName("containment");
     s.setQst(q);
     
     Topic t=new Topic();
     t.setTid(1);
     t.setTname("oops");
     t.setSubTopic(s);
     
     Subject s1=new Subject();
     s1.setSid(1);
     s1.setSname("core java");
     s1.setT(t);
     
     Branch b=new Branch();
     b.setBid(1);
     b.setBname("computer");
     b.setS(s1);
     
     Institute i=new Institute();
     i.setId(1);
     i.setiname(" TQ");
     i.setB(b);
     
     System.out.println(i);
     
     
     
     
    		
	}

}
