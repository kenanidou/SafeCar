public class Pragmatognomonas {
	private int _id;
	private String _onoma;
	private Arxeia_Ekthesewn_Pragmatognomosynhs _epilegei;
	private Statistika_Stoixeia _epilegei1;

	public Pragmatognomonas(int aId, String aOnoma,Arxeia_Ekthesewn_Pragmatognomosynhs _epilegei,Statistika_Stoixeia _epilegei1) {
		_id=aId;
		_onoma=aOnoma;
		this._epilegei=_epilegei;
		this._epilegei1=_epilegei1;
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
		System.out.println("Στοιχεία πραγματογνώμονα:");
		System.out.println("ID "+_id);
		System.out.println("Όνομα "+_onoma);
		System.out.println("Αρχείο πραγματογνωμοσύνης που επέλεξε "+_epilegei.getArithmos());
		System.out.println("Μέση τιμή στατιστικών στοιχείων που επέλεξε "+_epilegei1.getMesh_timh());
	}
}