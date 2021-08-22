package cap_05_strings_modificadores_de_acesso;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 == s2); //compara endereço
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s3 == s4); //compara endereço
		
		System.out.println(s1.equals(s3));
		
		//Concatenando Strings
		String s5 = "hel" + "lo"; //mesmo end
		String s6 = "hel" + "lo"; //mesmo end
		
		System.out.println(s5 == s6);
		
		//Forçando a criação no String Pool
		System.out.println(s1 == s3.intern());
		
		
		

	}

}
