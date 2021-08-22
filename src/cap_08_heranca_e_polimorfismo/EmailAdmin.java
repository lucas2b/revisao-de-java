package cap_08_heranca_e_polimorfismo;

public class EmailAdmin extends Staff{

	@Override
	public void printUserType() {
		System.out.println("EmailAdmin");
		
	}

	@Override
	public void saveWebLink() {
		System.out.println("EmailAdmin: saveWebLink");
		
	}
	
	@Override
	public Review postAReview(String reviewText) {
		System.out.println("EmailAdmin: postAReview");
		
		Review review = super.postAReview(reviewText); //chamada da implementação na classe superior
		return review;
	}
}
