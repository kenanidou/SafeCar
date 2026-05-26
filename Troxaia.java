public class Troxaia {
	private int _id;
	private Eggrafo_pelath _lambanei;

	   
	public Troxaia(int aId,Eggrafo_pelath _lambanei) {
		_id=aId;
		this._lambanei=_lambanei;
	}
	public void Lipsi_Eggrafon() {
        System.out.println("Λήψη Εγγράφων Πελάτη:");
        System.out.println("Είδος: "+_lambanei.getEidos());
        System.out.println("Ημερομηνία: "+_lambanei.getHmeromhnia());
        System.out.println("Κατάσταση : "+_lambanei.getKatastash());
    }

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public void printData() {
		System.out.println("Στοιχεία Τροχαίας:");
		System.out.println("Αριθμός "+_id);
	}
	}