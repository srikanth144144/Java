import java.util.Scanner;
import java.lang.*;

class ReversString{
public static void main(String args[]){

Scanner ed= new Scanner(System.in);
System.out.println("please enter you are string details");

  String str = ed.nextLine();
 
  char[] ch = str.toCharArray();
  for(int l= ch.length-1; l>=0;l-- ){
     System.out.print(ch[l]);
}
}
}
