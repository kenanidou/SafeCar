public class Paketo_Asfalisis {
    private String _asfalia;
  

    public Paketo_Asfalisis(String aAsfalia) {
        _asfalia = aAsfalia;
        
    }

    public void epilegei_kai_apothikevei_pakto_asfalishs() {
        System.out.println("Επιλογή και αποθήκευση πακέτου ασφάλισης:");
        
    }

    public void anazitaei_kai_emfanizei() {
        System.out.println("Αναζήτηση και εμφάνιση πακέτου ασφάλισης:");
        System.out.println(_asfalia);
    }

    public void Epilekse_epeksergasia_asfaleias() {
        System.out.println("Επιλογή επεξεργασίας ασφάλειας:");
        
    }

    public void Afise_idio_paketo() {
        System.out.println("Αφήστε το ίδιο πακέτο:");
      
    }

    public void Allakse_to_paketo() {
        System.out.println("Αλλαγή του πακέτου:");
       
    }

    public String getAsfalia() {
        return this._asfalia;
    }

    public void setAsfalia(String aAsfalia) {
        this._asfalia = aAsfalia;
    }
    
    public void printData() {
		System.out.println("Πακέτο Ασφάλειας:");
		System.out.println(_asfalia);
	
	}
}