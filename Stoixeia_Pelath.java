
public class Stoixeia_Pelath {
	private String _onomateponimo;
	private String _hmeromhnia_gennhshs;
	private String _dieythinsh;
	private int _arithmos_diplomatos_odigishs;

	
	public Stoixeia_Pelath(String aOnomateponimo, String aHmeromhnia_gennhshs, String aDieythinsh, int aArithmos_diplomatos_odigishs) {
		_onomateponimo=aOnomateponimo;
		_hmeromhnia_gennhshs=aHmeromhnia_gennhshs;
		_dieythinsh=aDieythinsh;
		_arithmos_diplomatos_odigishs=aArithmos_diplomatos_odigishs;
		
	}

	 public void simplironei_kai_apothikevei() {
	        System.out.println("Συμπλήρωση και Αποθήκευση Στοιχείων Πελάτη:");
	        System.out.println("Ονοματεπώνυμο: " + _onomateponimo);
	        System.out.println("Ημερομηνία Γέννησης: " + _hmeromhnia_gennhshs);
	        System.out.println("Διεύθυνση: " + _dieythinsh);
	        System.out.println("Αριθμός Διπλώματος Οδήγησης: " + _arithmos_diplomatos_odigishs);
	       
	    }

	
	public String getOnomateponimo() {
		return this._onomateponimo;
	}

	public void setOnomateponimo(String aOnomateponimo) {
		this._onomateponimo = aOnomateponimo;
	}

	public String getHmeromhnia_gennhshs() {
		return this._hmeromhnia_gennhshs;
	}

	public void setHmeromhnia_gennhshs(String aHmeromhnia_gennhshs) {
		this._hmeromhnia_gennhshs = aHmeromhnia_gennhshs;
	}

	public String getDieythinsh() {
		return this._dieythinsh;
	}

	public void setDieythinsh(String aDieythinsh) {
		this._dieythinsh = aDieythinsh;
	}

	public int getArithmos_diplomatos_odigishs() {
		return this._arithmos_diplomatos_odigishs;
	}

	public void setArithmos_diplomatos_odigishs(int aArithmos_diplomatos_odigishs) {
		this._arithmos_diplomatos_odigishs = aArithmos_diplomatos_odigishs;
	}
	
	public void printData() {
		System.out.println("Στοιχεία Πελάτη:");
		System.out.println("Ονοματεπώνυμο "+_onomateponimo);
		System.out.println("Ημερομηνία Γέννησης "+_hmeromhnia_gennhshs);
		System.out.println("Διεύθυνση "+_dieythinsh);
		System.out.println("Αριθμός διπλώμαατος Οδήγησης "+_arithmos_diplomatos_odigishs);
	
	}
}