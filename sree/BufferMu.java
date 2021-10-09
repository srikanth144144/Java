import java.io.*;
public class BufferMu
{
public static void main (String args[]) throws IOException{
BufferedReader df = new BufferedReader(new InputStreamReader(System.in));

 System.out.println(" please enter number one");
String v = df.readLine();
int a = Integer.parseInt(v);

System.out.println(" please enter number two");
String w = df.readLine();
int d = Integer.parseInt(w);
 
System.out.println("multi of a*d :"+(a*d));

}

}