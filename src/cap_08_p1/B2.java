package cap_08_p1;

import cap_08_heranca_e_polimorfismo.A1;

public class B2 {

	public static void main(String[] args) {
		//System.out.println(A1.privateMember);
		//System.out.println(A1.defaultMember);
		
		//System.out.println(A1.protectedMember);
		//System.out.println(C2.protectedMember); //B2 não está na família de A1 nem no mesmo pacote de A1
		
		System.out.println(A1.publicMember);
		System.out.println(C2.publicMember);
		

	}

}
