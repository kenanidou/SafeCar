public class Praktoras {
	private int _id;
	private String _onoma;
	private Fakelos _symplhrwnei;
	private Eggrafo_pelath _lambanei;
	private Arxeia_Ekthesewn_Pragmatognomosynhs _epilegei;

	


	public Praktoras(int aId, String aOnoma,Fakelos _symplhrwnei,Eggrafo_pelath _lambanei,Arxeia_Ekthesewn_Pragmatognomosynhs _epilegei) {
		_id=aId;
		_onoma=aOnoma;
		this._symplhrwnei=_symplhrwnei;
		this._lambanei=_lambanei;
		this._epilegei=_epilegei;
	}

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getOnoma() {
		return this._onoma;
	}

	public void setOnoma(String aOnoma) {
		this._onoma = aOnoma;
	}
	
	public void printData() {
		System.out.println("Στοιχεία Πράκτορα:");
		System.out.println("Αριθμός "+_id);
		System.out.println("Όνομα "+_onoma);
		System.out.println("Κωδικός φακέλου που συμπληρώνει "+_symplhrwnei.getKodikos());
		System.out.println("Είδος εγγράφου πελάτη που λαμβάνει "+_lambanei.getEidos());
		System.out.println("Αριθμού έκθεσης πραγματογνωμοσύνης που επιλέγει"+_epilegei.getArithmos());
	}
}

