package proshanto.com.builder;

import java.util.Date;

public class User {
	private String name;
	private String gender;
	private String contact;
	private Date dob;

	
	private User(UserBuilder builder) {
		super();
		this.name = builder.name;
		this.gender = builder.gender;
		this.contact = builder.contact;
		this.dob = builder.dob;
	}

	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getContact() {
		return contact;
	}

	public Date getDob() {
		return dob;
	}
	
	public static class UserBuilder {
		private String name;
		private String gender;
		private String contact;
		private Date dob;
		
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public UserBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public UserBuilder setContact(String contact) {
			this.contact = contact;
			return this;
		}
		public UserBuilder setDob(Date dob) {
			this.dob = dob;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
		
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", contact="
				+ contact + ", dob=" + dob + "]";
	}

}
