package cap_08_p1;

import cap_08_heranca_e_polimorfismo.*;

public class C2 extends A1{
	
	public static void main(String[] args) {
		//System.out.println(privateMember);
		//System.out.println(defaultMember); //pacote diferente
		
		System.out.println(protectedMember); //acessa DIRETAMENTE o "protected" pois está na hierarquia
		System.out.println(publicMember); //acesso direto, sem referencia a classe, pois está na hierarquia
		
	}

}
