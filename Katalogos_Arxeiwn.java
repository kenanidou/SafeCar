import java.util.ArrayList;

public class Katalogos_Arxeiwn {
	 private ArrayList<Arxeia_Ekthesewn_Pragmatognomosynhs> listaArxeia;

	    public Katalogos_Arxeiwn() {
	        this.listaArxeia = new ArrayList<>();
	    }

	    public void Kataxwrhsh_arxeiwn(Arxeia_Ekthesewn_Pragmatognomosynhs arxeio) {
	        System.out.println("Καταχώρηση Αρχείου Έκθεσης Πραγματογνωμοσύνης:");
	        System.out.println("Αριθμός Αρχείου: " + arxeio.getArithmos());
	        System.out.println("Ημερομηνία Αρχείου: " + arxeio.getHmeromhnia());
	        listaArxeia.add(arxeio);
	    }


	    public void printData() {
	        System.out.println("Λίστα Αρχείων Έκθεσης Πραγματογνωμοσύνης:");
	        for (Arxeia_Ekthesewn_Pragmatognomosynhs arxeio : listaArxeia) {
	            System.out.println("Αριθμός Αρχείου: " + arxeio.getArithmos());
	            System.out.println("Ημερομηνία Αρχείου: " + arxeio.getHmeromhnia());
	        }
	    }
	    
	  
	
}