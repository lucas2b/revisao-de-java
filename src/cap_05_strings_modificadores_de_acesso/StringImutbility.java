package cap_05_strings_modificadores_de_acesso;

public class StringImutbility {

	public static void main(String[] args) {
		String s1 = new String("abcd"); //abandonado
		s1 = new String("efg");
		
		System.out.println(s1);
		
		//imutabilidade
		String s2 = s1.concat("oi"); //valor de s1 inalterado
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
