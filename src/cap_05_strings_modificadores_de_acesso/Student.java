package cap_05_strings_modificadores_de_acesso;

//Classe exemplificadora de mod de acesso e construtores
public class Student {
	
	private int id;
	private String name;
	private String gender = "male";
	
	//Construtors
	public Student(int id, String name, String gender) {
		this(gender); //chamando o outro construtor
		System.out.println("Estou no construtor maior");
		this.id = id;
		this.name = name;
	}
	
	public Student(String gender) {
		System.out.println("Estou no construtor menor");
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		Student instancia = new Student(1, "Lucas", "female");
		System.out.println(instancia.getId() + " "+ instancia.getName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
