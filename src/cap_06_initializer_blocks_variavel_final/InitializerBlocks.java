package cap_06_initializer_blocks_variavel_final;

import java.util.ArrayList;
import java.util.List;

public class InitializerBlocks {
	int instanceVar;
	static int staticVar;
	
	static List<String> listaStringStatic = new ArrayList<String>();
	private List<String> listaStringIntancia;
	
	//corpo de inicialização de propriedades static
	static {
		
		listaStringStatic.add("lucas");
		listaStringStatic.add("alexandre");
		listaStringStatic.add("maiara");
		
		int i=0;
		while(i<2) {
			listaStringStatic.add(String.valueOf(i));
			i++;
		}
		
	}
	
	
	//Inicializador de propriedades do objeto
	//-- Util para inicializar e popular tipos complexos
	//-- Também é útil pois não é necessário implementar
	//   este trecho em todos construtores
	{
		listaStringIntancia = new ArrayList<String>();
		listaStringIntancia.add("arg1");
		listaStringIntancia.add("arg2");
		
		listaStringStatic.add("item adicionado por um objeto"); //pode referenciar atrib estat.
	}

	public static void main(String[] args) {
		
		System.out.println("-> Atributos estáticos inicializados:");
		for(String nome : listaStringStatic) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		System.out.println("-> Atributos de instância:");
		InitializerBlocks instancia = new InitializerBlocks();
		for(String item : instancia.listaStringIntancia) {
			System.out.println(item);
		}
		
		System.out.println();
		
		System.out.println("-> Printando novamente atrib estáticos:");
		for(String nome : listaStringStatic) {
			System.out.println(nome);
		}

	}
	
	private void instanceMethod() {
		instanceVar++;
		staticVar++;
		staticMethod();
	}
	
	static void staticMethod() {
		staticVar++;
		
	}

}
