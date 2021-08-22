package cap_08_heranca_e_polimorfismo;

public abstract class User {
	
	public String user = "user";
	
	public abstract void printUserType();
	
	public abstract void saveWebLink();
	
	//definido como protected, porém alterado
	//para public nas implementações
	protected abstract Review postAReview(String reviewText);

}
