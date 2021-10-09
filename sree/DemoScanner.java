import java .util.Scanner;
class DemoScanner{
public static void main( String args[]){
Scanner sy = new Scanner(System.in);

System.out.println("please enter name");
String n = sy.nextLine();

System.out.println("please enter phone number");
int p = sy.nextInt();
 

System.out.println("name :"+n);
System.out.println("phone number :"+p);
}
}

