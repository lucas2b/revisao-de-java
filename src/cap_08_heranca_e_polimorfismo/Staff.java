package cap_08_heranca_e_polimorfismo;

public class Staff extends User{
	
	public String staff = "staff";
	
	public int id = 1;
	public String userType = "Staff";
	
	public Staff() {
		System.out.println("Objeto Staff inicializado");
	}
	
	private String funcaoDoStaff;

	public String getFuncaoDoStaff() {
		return funcaoDoStaff;
	}

	public void setFuncaoDoStaff(String funcaoDoStaff) {
		this.funcaoDoStaff = funcaoDoStaff;
	}
	
	public void displayUserInfo() {
		System.out.println("\nPrinting User Info: ");
		System.out.println("id: " + id);
		System.out.println("userType: " + userType);
	}

	@Override
	public void printUserType() {
		System.out.println("Staff");
	}

	@Override
	public void saveWebLink() {
		System.out.println("Staff: saveWebLink");
	}
	
	@Override
	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = new Review(reviewText);
		return review;
	}
	
	public static void metodoStatic() {
		//não pode ser sobrescrito
	}
}
