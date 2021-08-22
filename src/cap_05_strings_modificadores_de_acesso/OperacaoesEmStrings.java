package cap_05_strings_modificadores_de_acesso;

public class OperacaoesEmStrings {

	public static void main(String[] args) {
		
		char[] array = {'l', 'u', 'c', 'a', 's'};
		String s = new String(array);
		
		//String manipulation
		
		String s1 = "Hello world!";
		String[] stringParseada = s1.split(" ");
		
		for(String palavra : stringParseada) {
			System.out.println(palavra);
		}
		System.out.println();
		
		//---- Comparação
		
		System.out.println("Comparação:\n");
		
		System.out.print("s1.equals(\"Hello World!\"): ");
		System.out.println(s1.equals("Hello World!"));
		
		System.out.print("s1.equalsIgnoreCase(\"HELLO WORLD!\"):");
		System.out.println(s1.equalsIgnoreCase("HELLO WORLD!"));
		
		System.out.print("s.compareTo(\"HELLO WORLD!\"):"); 
		System.out.println(s.compareTo("H")); //compara apenas a primeira letra da String
		
		System.out.println();
		
		//---- Busca
		
		System.out.println("Busca:\n");
		
		System.out.print("s1.contains(\"HELLO WORLD!\"):");
		System.out.println(s1.contains("HELLO WORLD!"));
		
		System.out.print("s1.contains(\"world!\"):");
		System.out.println(s1.contains("world!"));
		
		System.out.print("s1.startsWith(\"HELLO WORLD!\"):");
		System.out.println(s1.startsWith("HELLO WORLD!"));
		
		System.out.print("s1.startsWith(\"hello world!\"):");
		System.out.println(s1.startsWith("hello world!"));
		
		System.out.print("s1.startsWith(\"Hello world!\"):");
		System.out.println(s1.startsWith("Hello world!"));
		
		System.out.print("s1.endsWith(\"d!\"):");
		System.out.println(s1.endsWith("d!"));
		
		System.out.print("s1.indexOf(\"lo\"):");
		System.out.println(s1.indexOf("lo"));
		
		System.out.print("s1.indexOf(\"o\"):");
		System.out.println(s1.indexOf("o"));
		
		System.out.print("s1.lastIndexOf(\"ld\"):");
		System.out.println(s1.lastIndexOf("ld"));
		
		System.out.println();
		
		//Examinando caracteres individuais
		
		System.out.println("Examinando caracteres individuais:\n");
		
		System.out.print("s1.charAt(4):");
		System.out.println(s1.charAt(4));
		
		System.out.println();
		
		//Substrings
		
		System.out.println("Substrings:\n");
		
		System.out.print("s1.substring(4):"); //Hello world!
		System.out.println(s1.substring(4)); //do 4 em diante
		
		System.out.print("s1.substring(4, 9):");
		System.out.println(s1.substring(4, 9)); //Hello world!
		
		System.out.println();
		
		//Static method 
		System.out.println("String.valueOf(1.34):");
		System.out.print(String.valueOf(1.34));

	}

}
