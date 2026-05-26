
	public class Fakelos {
		private boolean _katastash;
		private int _kodikos;
		private String _hmeromhnia;
		private Paketo_Asfalisis _exei;
		private Stoixeia_Pelath _exei1;
		private Stoixeia_Oxhmatos _exei2;
	
		
		public  Fakelos(boolean aKatastash, int aKodikos, String aHmeromhnia,Paketo_Asfalisis _exei,Stoixeia_Pelath _exei1,Stoixeia_Oxhmatos _exei2) {
			_katastash=aKatastash;
			_kodikos=aKodikos;
			_hmeromhnia=aHmeromhnia;
			
			this._exei=_exei;
			this._exei1=_exei1;
			this._exei2=_exei2;		
		}
		
		
		public void dhmiourgei() {
		    System.out.println("Δημιουργία φακέλου:");
		    System.out.println("Κατάσταση: " + (_katastash ? "Ενεργός" : "Ανενεργός"));
		    System.out.println("Κωδικός: " + _kodikos);
		    System.out.println("Ημερομηνία: " + _hmeromhnia);
		    System.out.println("Πακέτο Ασφάλισης: " + _exei);

		}

		public void Anaktise(String aOnomateponimo) {
		    System.out.println("Ανάκτηση φακέλου για πελάτη με ονοματεπώνυμο: " + aOnomateponimo);
		   
		}

		public void Epilogi_Asfaleia_Oximatos() {
		    System.out.println("Επιλογή ασφάλειας οχήματος:");
		    
		}

	

		public void Kataxwrise_to_paketo() {
		    System.out.println("Καταχώρηση πακέτου:");
		   
		}

		
		public boolean getKatastash() {
			return this._katastash;
		}

		public void setKatastash(boolean aKatastash) {
			this._katastash = aKatastash;
		}

		public int getKodikos() {
			return this._kodikos;
		}

		public void setKodikos(int aKodikos) {
			this._kodikos = aKodikos;
		}

		public String getHmeromhnia() {
			return this._hmeromhnia;
		}

		public void setHmeromhnia(String aHmeromhnia) {
			this._hmeromhnia = aHmeromhnia;
		}
		
		public String getStoixeiaPelathName() {
		    return _exei1.getOnomateponimo();
		}
		
		

		public void printData() {
			System.out.println("Στοιχεία Φακέλου Πελάτη:");
		    System.out.println("Κατάσταση: " + (_katastash ? "Ενεργός" : "Ανενεργός"));
		    System.out.println("Κωδικός: " + _kodikos);
		    System.out.println("Ημερομηνία: " + _hmeromhnia);
		    System.out.println("Πακέτο Ασφάλισης: " + _exei.getAsfalia());
		    System.out.println("Πελάτης: " + _exei1.getOnomateponimo());
		    System.out.println("Όχημα: " + _exei2.getMarka());
		}
	}