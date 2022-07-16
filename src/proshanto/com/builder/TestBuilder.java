package proshanto.com.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		User user= new User.UserBuilder().setContact("0191233955").setGender("F").build();
		System.err.println(user.toString());
	}

}
