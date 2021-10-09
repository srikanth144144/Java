package Projects;
public class Inter {
	public static void main(String[] args) {
//		System.out.println(SRR.age);
//		
//		SRR s = new SRR() {
//		public 	void m1() {
// System.out.println("madhu");				
//			}
//		};
//		s.m1();
//	}
//}
//interface SRR{
//	 int age = 24;
//	 public void m1() ;
	//b obj = new b();
	
	A obj1 = new b();
	

	obj1.m();
	
//	obj2.m();
//	obj2.m();
//	obj2.m2();
//	
}
}
class A{
	 void m() {
		System.out.println("super");
		
	}		
	}

class b extends A{
 void m1() {
	 //super.m();
		 System.out.println("child");
		
	}

}

