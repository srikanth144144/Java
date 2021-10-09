package Projects;
import Projects.AS.B;
public class Memberinner {
	public static void main(String[] args) {
//		AS obj = new AS();
//		obj.i=5;
//		AS.B obj1 = obj.new B();
//		obj1.j=6;
//		
		AS.i=5;
		System.out.println(AS.i);
	AS.B obj1 = new AS.B();
	obj1.j= 6;
	System.out.println(obj1.j);
	}
}
class AS{
	 static int i;
	 static class B{
		int j;
	}
}
