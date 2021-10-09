package Projects;
public class Innerclassoverriding {
	public static void main(String[] args) {
	Ph p = new Smart();
	p.show();
	}
}
class Ph{
	public void show() {
		System.out.println("call2");
	}
}
class Smart extends Ph{
	public void show() {
		System.out.println("call,camer ,sms");
	}
}