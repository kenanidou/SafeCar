public class Skanarismena_eggrafa {
	
	private Praktoras _skanarei;
	private String _eidos;
	private String _hmeromhnia;
	private boolean _katastash;
	
	
	public Skanarismena_eggrafa(String aEidos, String aHmeromhnia, boolean aKatastash,Praktoras _skanarei) {
		_eidos=aEidos;
		_hmeromhnia=aHmeromhnia;
		_katastash=aKatastash;
	
	}
	
	

	public void epilegei() {
		  System.out.println("Σαρώθηκε από Πράκτορα: " + _skanarei.getOnoma());
	}

	public void anazhthse() {
		 System.out.println("Αναζήτηση εγγράφων που σκαναρίστηκαν από τον πράκτορα: " + _skanarei.getOnoma());;
	}
	
	public String get_eidos() {
		return this._eidos;
	}

	public void set_eidos(String _eidos) {
		this._eidos = _eidos;
	}
	
	public String get_hmeromhnia() {
		return this._hmeromhnia;
	}

	public void set_hmeromhnia(String _hmeromhnia) {
		this._hmeromhnia = _hmeromhnia;
	}
	
	public void printData() {
		System.out.println("Σκαναρισμένα Έγγραφα:");
		System.out.println("Αριθμός "+_eidos);
		System.out.println("Όνομα "+_hmeromhnia);
		if(_katastash==true)
			System.out.println("Κατάσταση Έτοιμα" );
		else System.out.println("Κατάσταση Αναμονή");
		
	}
	
	
}