public class Idiokthths {
	private int _id;
	private String _onoma;
	private Statistika_Stoixeia _epilegei;

	public Idiokthths(int aId, String aOnoma,Statistika_Stoixeia _epilegei) {
		_id=aId;
		_onoma=aOnoma;
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
		System.out.println("Στοιχεία Ιδιοκτήτη :");
		System.out.println("ID "+_id);
		System.out.println("Όνομα "+_onoma);
		System.out.println("Μέση τιμή στατιστικών στοιχείων που επιλέγει ο ιδιοκτήτης "+_epilegei.getMesh_timh());
	}
	
}