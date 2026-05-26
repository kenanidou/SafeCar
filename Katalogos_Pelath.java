import java.util.ArrayList;


public class Katalogos_Pelath {
    private ArrayList<Fakelos> listaFakeloi;

    public Katalogos_Pelath() {
        this.listaFakeloi = new ArrayList<>();
    }

    public void addFakelos(Fakelos unnamed_Fakelos) {
        this.listaFakeloi.add(unnamed_Fakelos);
    }

    public void Anazitisi(String aOnomateponimo) {
        System.out.println("Αναζήτηση Πελάτη με Ονοματεπώνυμο: " + aOnomateponimo);
        for (Fakelos fakelos : listaFakeloi) {
            if (fakelos.getStoixeiaPelathName().equals(aOnomateponimo)) {
                System.out.println("Ο πελάτης βρέθηκε στο φάκελο.");
                return;
            }
        }
        System.out.println("Ο πελάτης δεν βρέθηκε στο φάκελο.");
    }

    public void Euresi_pelati() {
        System.out.println("Εύρεση Πελάτη:");
        
        for (Fakelos fakelos : listaFakeloi) {
            System.out.println("Φάκελος Πελάτη:");
            System.out.println(fakelos.getStoixeiaPelathName());
   
        }
    }

    public void prosthesiFakelou(Fakelos fakelos) {
        this.listaFakeloi.add(fakelos);
    }
    
	public void printData() {
		System.out.println("Ο κατάλογος πελάτη περιλαμβάνει μία λίστα με τους φακέλους:");
		for(Fakelos fak:listaFakeloi) {
			System.out.println("Κατάσταση: " + (fak.getKatastash() ? "Ενεργός" : "Ανενεργός"));
		    System.out.println("Κωδικός: " + fak.getKodikos());
		    System.out.println("Ημερομηνία: " + fak.getHmeromhnia());
		 
		
		}
	}
}