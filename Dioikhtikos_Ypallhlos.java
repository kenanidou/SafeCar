public class Dioikhtikos_Ypallhlos {
	private String _onoma;
	private int _id;
	

	public Dioikhtikos_Ypallhlos(String aOnoma, int aId) {
		_onoma=aOnoma;;
		_id=aId;
	}

	public String aId() {
		return this._onoma;
	}

	public void setOnoma(String aOnoma) {
		this._onoma = aOnoma;
	}
	public String getOnoma() {
		return _onoma;
	}

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}
	
	public void printData() {
		System.out.println("Στοιχεία Διοικητικού Υπαλλήλου");
		System.out.println("Arithmos "+_onoma);
		System.out.println("Hmeromhnia "+_id);
	}
}