package cap_08_heranca_e_polimorfismo;

public class Editor extends Staff{
	
	public int id = 2; //sobrescrevendo
	
	public String editor = "editor";
	
	private String programaDeEdicaoFavorito;
	public String teste;
	
	public String getProgramaDeEdicaoFavorito() {
		return programaDeEdicaoFavorito;
	}

	public void setProgramaDeEdicaoFavorito(String programaDeEdicaoFavorito) {
		this.programaDeEdicaoFavorito = programaDeEdicaoFavorito;
	}
	
	public Editor() {
		System.out.println("Objeto Editor inicializado");
		userType = "Editor";
	}

	@Override
	public void printUserType() {
		System.out.println("Editor");
	}
	
	public void approveReview() {
		System.out.println("Editor: approveReview");
	}
	
	public void rejectReview() {
		System.out.println("Editor: rejectReview");
	}
	

	//Proibido sobrescrever métodos estáticos
	//	@Override
//	public static void metodoStatic() {
//		//não pode ser sobrescrito
//	}

}
