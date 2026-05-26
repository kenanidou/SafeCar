public class Stoixeia_Oxhmatos {
	private int _arithmos_kykloforias;
	private String _montelo;
	private String _marka;
	private String _xroma;
	private int _kibika_ekatosta;
	
	
	public Stoixeia_Oxhmatos(int aArithmos_kykloforias, String aMontelo, String aMarka, String aXroma, int aKibika_ekatosta) {
		_arithmos_kykloforias=aArithmos_kykloforias;
		_montelo=aMontelo;
		_marka=aMarka;
		_kibika_ekatosta=aKibika_ekatosta;
		
	}

	 public void simplironei_kai_apothikevei() {
		 System.out.println("Συμπληρωμένα δεδομένα οχήματος:");
		    System.out.println("Αριθμός Κυκλοφορίας: " + _arithmos_kykloforias);
		    System.out.println("Μοντέλο: " + _montelo);
		    System.out.println("Μάρκα: " + _marka);
		    System.out.println("Χρώμα: " + _xroma);
		    System.out.println("Κιβικά Εκατόστα: " + _kibika_ekatosta);
	    }


	

	public int getArithmos_kykloforias() {
		return this._arithmos_kykloforias;
	}

	public void setArithmos_kykloforias(int aArithmos_kykloforias) {
		this._arithmos_kykloforias = aArithmos_kykloforias;
	}

	public String getMontelo() {
		return this._montelo;
	}

	public void setMontelo(String aMontelo) {
		this._montelo = aMontelo;
	}

	public String getMarka() {
		return this._marka;
	}

	public void setMarka(String aMarka) {
		this._marka = aMarka;
	}

	public String getXroma() {
		return this._xroma;
	}

	public void setXroma(String aXroma) {
		this._xroma = aXroma;
	}

	public int getKibika_ekatosta() {
		return this._kibika_ekatosta;
	}

	public void setKibika_ekatosta(int aKibika_ekatosta) {
		this._kibika_ekatosta = aKibika_ekatosta;
	}
	public void printData() {
		System.out.println("Στοιχεία Οχήματος:");
		System.out.println("Αριθμός κυκλοφορίας "+_arithmos_kykloforias);
		System.out.println("Μοντέλο "+_montelo);
		System.out.println("Μάρκα "+_marka);
		System.out.println("Χρώμα "+_xroma);
		System.out.println("Κυβικά εκατοστά "+_kibika_ekatosta);
	}
}