public class Asfalistikh_Etairia {
	private int _id;
	private Eggrafo_pelath _lambanei;


	public Asfalistikh_Etairia(int aId,Eggrafo_pelath _lambanei) {
		_id=aId;
		this._lambanei=_lambanei;
	}



    public void Apostoli_Eggrafon() {
        System.out.println("Αποστολή Εγγράφων Πελάτη:");
        System.out.println("Είδος εγγράφου: " + _lambanei.getEidos());
        System.out.println("Ημερομηνία εγγράφου: " + _lambanei.getHmeromhnia());
        System.out.println("Κατάσταση εγγράφου: " + _lambanei.getKatastash());
    }

    public void Lipsi_Eggrafon() {
        System.out.println("Λήψη Εγγράφων Πελάτη:");
        System.out.println("Είδος εγγράφου: " + _lambanei.getEidos());
        System.out.println("Ημερομηνία εγγράφου: " + _lambanei.getHmeromhnia());
        System.out.println("Κατάσταση εγγράφου: " + _lambanei.getKatastash());
    }


	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}
	
	public void printData() {
		System.out.println("Στοιχεία Ασφαλιστικής Εταιρείας:");
		System.out.println("Αριθμός "+_id);
	
	}
}