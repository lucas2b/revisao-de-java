package cap_06_initializer_blocks_variavel_final;

public class FinalVariables {

	private static final int[] SALAS_DE_AULA = {10,20,40}; //inicializando
	
	static {
		SALAS_DE_AULA[0] = 99;
		SALAS_DE_AULA[1] = 100;
		SALAS_DE_AULA[2] = 101;
	}
	
	public static void main(String[] args) {
		
		for(int i : SALAS_DE_AULA) {
			System.out.println(i);
		}

	}
	
	public FinalVariables() {
		
	}

}
