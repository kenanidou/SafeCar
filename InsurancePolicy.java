
public class InsurancePolicy {
      private String kodikos_paketou;
      private String perigrafi;
      private String diarkeia;
      
      
      public InsurancePolicy(String akodikos_paketou, String aperigrafi, String adiarkeia) {
         kodikos_paketou=akodikos_paketou;
         setPerigrafi(aperigrafi);
         diarkeia=adiarkeia;
      }


	public String getPerigrafi() {
		return perigrafi;
	}


	public void setPerigrafi(String perigrafi) {
		this.perigrafi = perigrafi;
	}


	
      
 }
