import java.util.Scanner;
class Scannerabc{
public static void main(String args[]){
Scanner o = new Scanner(System.in);

System.out.println("please enter name ");
      String b = o.nextLine();

System.out.println("please enter salary ");
      int  c = o.nextInt();

System.out.println("please enter pf ");
      int d = o.nextInt();

System.out.println("please enter hra ");
      int e = o.nextInt();

System.out.println("please enter da ");
      int f = o.nextInt();

int g = c*d/100;
int h = c*e/100;
int i = c*f/100;
int j = c-h-i-g;

  System.out.println("name :"+b);
  
   System.out.println("netsalary :"+j);

}
}
