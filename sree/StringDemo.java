import java.lang.String;
import java.util.Scanner;
public class StringDemo{
public static void main(String args[]){

String gh = "srikanth from blr";
char[] ch = gh.tocharArray();
gh.getchars(3,6, ch,0);
System.out.println(ch);
}
}