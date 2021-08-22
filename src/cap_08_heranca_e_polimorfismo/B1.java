package cap_08_heranca_e_polimorfismo;

import cap_08_p1.C2;

public class B1 {

	public static void main(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);
		
		System.out.println(A1.defaultMember);
		System.out.println(C1.protectedMember);
			
		
		System.out.println(A1.protectedMember); //Como? pois esta classe n herda de A1
		//R: Neste caso, ao referenciar a classe A1,
		//o "protectedMember" pode ser acessado mesmo
		//fora da hierarquia de classes
		//desde que esteja no mesmo pacote
		
		
		System.out.println(C1.protectedMember); //Acesso através de C1, pois B1 está no mesmo pacote.
		System.out.println(C2.protectedMember); //Acecsso através de C2, pois B1 está no mesmo pacote.
		
		
		System.out.println(A1.publicMember);
		System.out.println(C1.publicMember);
	}
	
}