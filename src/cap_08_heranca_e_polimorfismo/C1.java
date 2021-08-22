package cap_08_heranca_e_polimorfismo;

public class C1 extends A1{

		public static void main(String[] args) {
			//System.out.println("privateMember: " + privateMember);
			
			//Membros herdados são diretamente acessíveis sem nomenclatura de classe
			System.out.println(defaultMember);
			System.out.println(protectedMember);
			System.out.println(publicMember);
			
			
			
		}
}
