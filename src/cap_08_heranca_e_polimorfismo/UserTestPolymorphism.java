package cap_08_heranca_e_polimorfismo;

public class UserTestPolymorphism {

	public static void main(String[] args) {
		
		//Demonstrações de Polimorfismo
		
		User staff = new Staff();	
		
		Staff editor = new Editor();
		editor.saveWebLink(); //chamará o mais especializado
			
		//editor.approveReview();
		
		if(editor instanceof Editor) {			
			((Editor) editor).approveReview(); //downcasting
		}
		
		//------------------------------------------------------------
		
		Editor editor2 = new Editor();
		editor2.approveReview(); //método tem acesso, pois só está definido em "Editor"
		
		
		
		System.out.println("--------------");
		
		//Testando polimorfismo via passagem em método
		System.out.println("Polimorfismo na passagem de método:");
		UserTestPolymorphism ut = new UserTestPolymorphism();
		ut.printUserType(staff);
		ut.printUserType(editor);
		
		ut.printUserType(editor2); //também é polimorfico
		
		//Tanto o tipo de referência Staff ou Editor funcionam
		//para ser aplicados em métodos polimórficos
		
		System.out.println("--------------");
		
		//--------------------------------------------------
		
		Staff emailAdmin = new EmailAdmin();
		ut.postAReview(emailAdmin, "review do emailAdmin"); //mais especializado (internamente chama o método superior)
		ut.postAReview(staff, "review do Staff");  //genérico (sem implementação especializada)
		ut.postAReview(editor, "review do Editor"); //genérico (sem implementação especializada)
		

	}
	
	public void printUserType(User u) {
		u.printUserType();
	}
	
	public void postAReview(User u, String reviewText) {
		u.postAReview(reviewText);
	}

}
