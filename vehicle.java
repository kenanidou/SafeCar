
public class vehicle {
	private String Marka;
	private String Modelo;
	private String Pinakida;
	private String Year;
	private String Arithmos_Plaisiou;
	
	public vehicle(String aMarka, String aModelo, String aPinakida, String aYear, String aArithmos_Plaisiou) {
		setMarka(aMarka);
		setModelo(aModelo);
		setPinakida(aPinakida);
		setYear(aYear);
		setArithmos_Plaisiou(aArithmos_Plaisiou);
	}

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPinakida() {
		return Pinakida;
	}

	public void setPinakida(String pinakida) {
		Pinakida = pinakida;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getArithmos_Plaisiou() {
		return Arithmos_Plaisiou;
	}

	public void setArithmos_Plaisiou(String arithmos_Plaisiou) {
		Arithmos_Plaisiou = arithmos_Plaisiou;
	}

	public void printve() {
		System.out.print(" " + getMarka() + " " +getModelo() + " " +getPinakida() + " " +getPinakida() + " " + getYear()); 
	}
}
