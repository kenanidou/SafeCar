
import java.util.*;

public class InsuranceContract {
     private int cost;
     private ArrayList<customer> enrolledcustomer;
     private ArrayList<vehicle> enrolledvehicle;

    
     public InsuranceContract(int acost) {
    	 cost=acost;
    	 enrolledcustomer = new ArrayList<customer>();
    	 enrolledvehicle  = new ArrayList<vehicle>();
    	 
     }
    
     
     public void addcustomer(customer c) {
			enrolledcustomer.add(c);
			
	}
     
    public void addvehicle(vehicle v) {
    	enrolledvehicle.add(v);
    }
     
	
	public void printcustomerInfo() {
		for(int i=0; i<enrolledcustomer.size(); i++) {
			System.out.print(" " + enrolledcustomer.get(i).getName());
		}
		for(int i=0; i<enrolledvehicle.size(); i++) {
			System.out.print(" " + enrolledvehicle.get(i).getPinakida());
		}
			
	}
	
	public String cu(int i) {
		return enrolledcustomer.get(i).getName();
	}
	
	
	public int getcost() {
		return cost;
	}

	
	
}
