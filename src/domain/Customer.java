package domain;
import java.time.LocalDateTime;

public class Customer 
{
		private Long customer_ID;
		private String email;
		private String firstname;
		private String lastname;
		private String gender;
		private LocalDateTime birthdate;
		private Long credits;
		
		
		public Customer(Long customer_ID, String email, String firstname, String lastname, String gender, LocalDateTime birthdate, Long credits) 
		{
			setCustomer_ID(customer_ID);
			setEmail(email);
			setFirstname(firstname);
			setLastname(lastname);
			setGender(gender);
			setBirthdate(birthdate);
			setCredits(credits);
		}
		
		
		public Long getCustomer_ID() 
		{
			return customer_ID;
		}


		public void setCustomer_ID(Long customer_ID) 
		{
			this.customer_ID = customer_ID;
		}


		public String getEmail() 
		{
			return email;
		}


		public void setEmail(String email) 
		{
			this.email = email;
		}


		public String getFirstname() 
		{
			return firstname;
		}


		public void setFirstname(String firstname) 
		{
			this.firstname = firstname;
		}


		public String getLastname() 
		{
			return lastname;
		}


		public void setLastname(String lastname) 
		{
			this.lastname = lastname;
		}


		public String getGender() 
		{
			return gender;
		}


		public void setGender(String gender) 
		{
			this.gender = gender;
		}


		public LocalDateTime getBirthdate() 
		{
			return birthdate;
		}


		public void setBirthdate(LocalDateTime birthdate) 
		{
			this.birthdate = birthdate;
		}


		public Long getCredits() 
		{
			return credits;
		}


		public void setCredits(Long credits) 
		{
			this.credits = credits;
		}


		@Override
		public String toString() 
		{
			return "Customer [customer_ID=" + customer_ID + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", gender=" + gender + ", birthdate=" + birthdate + ", credits=" + credits + "]\n";
		}
	
	
}
