import java.io.Console;
class DemoConsole{
public static void main(String args[]){

Console df = System.console();

System.out.println("please enter name");
String d = df.readLine();

System.out.println("please enter password");
char[] ch= df.readPassword();


System.out.println("name :"+d);
System.out.println("password : "+ch);


}


}

