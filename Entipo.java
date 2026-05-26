import java.util.ArrayList;


public class Entipo {
    private ArrayList<Skanarismena_eggrafa> listaEggrafon;

    public Entipo() {
        this.listaEggrafon = new ArrayList<>();
    }

    public void addEggrafo(Skanarismena_eggrafa unnamed_Skanarismena_eggrafa) {
        this.listaEggrafon.add(unnamed_Skanarismena_eggrafa);
    }

    public void topothetei(Skanarismena_eggrafa eggrafo) {
        this.listaEggrafon.add(eggrafo);
    }
    
    public void printData() {
		System.out.println("Το έντυπο περιλαμβάνει τα σκαναρισμένα έγγραφα:");
		for(Skanarismena_eggrafa sk:listaEggrafon) {
			System.out.println("Είδος εγγράφου "+sk.get_eidos());
			System.out.println("Ημερομηνία εγγράφου "+sk.get_hmeromhnia());
		
		}
	}
}