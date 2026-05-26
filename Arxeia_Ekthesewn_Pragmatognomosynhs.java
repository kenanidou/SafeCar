public class Arxeia_Ekthesewn_Pragmatognomosynhs {
	private int _arithmos;
	private String _hmeromhnia;

	

	public Arxeia_Ekthesewn_Pragmatognomosynhs(int aArithmos, String aHmeromhnia) {
		_arithmos=aArithmos;
		_hmeromhnia=aHmeromhnia;
			
	}

	public int getArithmos() {
		return this._arithmos;
	}

	public void setArithmos(int aArithmos) {
		this._arithmos = aArithmos;
	}

	public String getHmeromhnia() {
		return this._hmeromhnia;
	}

	public void setHmeromhnia(String aHmeromhnia) {
		this._hmeromhnia = aHmeromhnia;
	}
	
	public void printData() {
		System.out.println("Έκθεση πραγματογνωμοσύνης με στοιχεία:");
		System.out.println("Αριθμός "+_arithmos);
		System.out.println("Ημερομηνία "+_hmeromhnia);
	}
}