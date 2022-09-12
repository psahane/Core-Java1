
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Fact{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		
String inp=br.readLine();

int num=Integer.parseInt(inp);
String outp="1";
int fact=1;
int count=2;
System.out.print(outp);
while(true)
{
fact=fact*count;
if(fact>num){
break;
	}
outp=outp+""+fact;
count++;


}
System.out.println(outp);
}

	
}