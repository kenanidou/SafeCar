
public class customer {
	   private String Name;
	   private String LastName;
	   private String Phone;
	   private String Email;
	   private String Arithmos_Taftotitas;
	   
	   public customer(String aName, String aLastName, String aPhone, String aEmail, String aArithmos_Taftotitas) {
	       setName(aName);
	       LastName=aLastName;
	       Phone=aPhone;
	       Email=aEmail;
	       setArithmos_Taftotitas(aArithmos_Taftotitas);
	   } 

	public String getArithmos_Taftotitas() {
		return Arithmos_Taftotitas;
	}

	public void setArithmos_Taftotitas(String arithmos_Taftotitas) {
		Arithmos_Taftotitas = arithmos_Taftotitas;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
}
