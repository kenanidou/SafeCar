public class Eggrafo_pelath {
	private int id;
	private String _eidos;
	private String _hmeromhnia;
	private boolean _katastash;
	
	
	public Eggrafo_pelath(int id,String aEidos, String aHmeromhnia, boolean aKatastash) {
		this.id=id;
		_eidos=aEidos;
		_hmeromhnia=aHmeromhnia;
		_katastash=aKatastash;
	}

	
	public String getEidos() {
		return this._eidos;
	}

	public void setEidos(String aEidos) {
		this._eidos = aEidos;
	}
	
	public int getId() {
		return this.id;
	}

	public void setEidos(int id) {
		this.id = id;
	}

	public String getHmeromhnia() {
		return this._hmeromhnia;
	}

	public void setHmeromhnia(String aHmeromhnia) {
		this._hmeromhnia = aHmeromhnia;
	}

	public boolean getKatastash() {
		return this._katastash;
	}

	public void setKatastash(boolean aKatastash) {
		this._katastash = aKatastash;
	}
	
	public void printData() {
		System.out.println("Στοιχεία Εγγράφου Πελάτη:");
		System.out.println("Αριθμός "+_eidos);
		System.out.println("Ημερομηνία "+_hmeromhnia);
		if (_katastash==true) {
			System.out.println("Κατάσταση Έτοιμο");
		}
		else {
			System.out.println("Κατάσταση Εκρεμμότητα");
		}
	}
}