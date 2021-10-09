package Projects;
import java.util.Scanner;
public class Lam {
	public static void main(String[] args) {
		 int x=5;
		 int y=x++;//5-->6
		 System.out.println(x++ + ++x);//6-->7  +7-->8=14
		 System.out.println(--x + x++);//8-->7   +7-->8=14
          
//		 int z = 5;
//		 int g = z++;
//		 System.out.println(z++ + z++);
//		 System.out.println(++z + z++);
//		 
//		 int a = 4;
//		 System.out.println(a++ + --a);
//		 System.out.println(--a + a--);
//		 	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter starting number");
//		int num = sc.nextInt();
//		System.out.println("enter last number");
//		int num1 = sc.nextInt();
//		while (num<=num1) {
//			num++;
//			System.out.println(num);
//		}
	}
}
