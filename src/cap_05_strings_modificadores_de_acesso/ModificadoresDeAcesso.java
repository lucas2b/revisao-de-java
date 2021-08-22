package cap_05_strings_modificadores_de_acesso;

public class ModificadoresDeAcesso { //acessível publicamente por outros packages
	
	private int propriedadePrivada;
	protected int propriedadeProtected;
	public int propriedadePublica;
	
	public ModificadoresDeAcesso() {
		System.out.println("Construtor da classe ModificadoresDeAcesso");
	}

	void acessivelApenasDentroDoMesmoPackage() {
		
	}
	
	private void acessivelApenasNestaClasse() {
		
	}
	
	protected void acessivelApenasNestaClasseESubclasses() {
		
	}
	
	public static void main(String[] args) {
		
		ModificadoresDeAcesso instancia1 = new ClasseQueHerda();
		System.out.println("Estou na main");
	}

}

class ClasseQueHerda extends ModificadoresDeAcesso{
	
	void metodoTeste() {
		System.out.println(this.propriedadeProtected);
	}
	
	public ClasseQueHerda() {
		metodoTeste();
		System.out.println("Construtor da ClasseQueHerda"); //primeiro invoca a super
	}
}
