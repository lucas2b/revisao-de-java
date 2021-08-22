package cap_09_interfaces;

public class C extends B{
	
	public int c = 3;

	@Override
	public void metodo1() {
		super.metodoB();
		
	}
	
	@Override
	public void metodo2() {
		
	}
	
	public static void main(String[] args) {
		A x = new C();
		
		int a = x.a;
		int b = ((B)x).b; //downcast
		int c = ((C)x).c; //downcast
		
	}

}
