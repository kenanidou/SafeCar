import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tau,ap;
		tau="AO77813";
		ap="7C3FR76A555071465";
		
		customer customer1 = new customer( "Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432");
		while (customer1.getArithmos_Taftotitas() == tau) {
			System.out.println("Yparxei idi aytos o pelaths doste kainoyrgio arithmo taytotitas");
			tau = scanner.nextLine();
		}
		customer customer2 = new customer("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com",tau);
		tau="AO45698";
		while (customer1.getArithmos_Taftotitas() == tau || customer2.getArithmos_Taftotitas() == tau) {
			System.out.println("Yparxei idi aytos o pelaths doste kainoyrgio arithmo taytotitas");
			tau = scanner.nextLine();
		}
		customer customer3 = new customer("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
		 
		
		vehicle vehicle1 = new vehicle("Mercedes", "GLC", "XKP8923", "2020","7C3FR76A515072256");
		while (vehicle1.getArithmos_Plaisiou() == ap) {
			System.out.println("Yparxei idi aytos to oxhma doste kainoyrgio arithmo plaisioy");
			ap = scanner.nextLine();
		}
		vehicle vehicle2 = new vehicle("Subaru", "Forester", "NII4269", "2018",ap);
		ap="7C3FR76A55504645";
		while (vehicle1.getArithmos_Plaisiou() == ap || vehicle2.getArithmos_Plaisiou() == ap) {
			System.out.println("Yparxei idi aytos to oxhma doste kainoyrgio arithmo plaisioy");
			ap = scanner.nextLine();
		}
		vehicle vehicle3 = new vehicle("Ford", "Ranger", "KOH4681", "2022",ap);	
		
		scanner.close();
		
		InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");
		
		InsuranceContract InsuranceContract1 = new InsuranceContract(60); 
		InsuranceContract InsuranceContract2 = new InsuranceContract(120);
		InsuranceContract InsuranceContract3 = new InsuranceContract(80);

		InsuranceContract1.addcustomer(customer1);
	    InsuranceContract2.addcustomer(customer2);
	    InsuranceContract3.addcustomer(customer2);
		
		
		InsuranceContract1.addvehicle(vehicle1);
		InsuranceContract2.addvehicle(vehicle2);
		InsuranceContract3.addvehicle(vehicle3);
		
		
		
		
		InsuranceContract1.printcustomerInfo();
		System.out.print(" " + InsurancePolicy2.getPerigrafi());
		System.out.print(" " + InsuranceContract1.getcost());
		System.out.println();
		InsuranceContract2.printcustomerInfo();
		System.out.print(" " + InsurancePolicy1.getPerigrafi());
		System.out.print(" " + InsuranceContract2.getcost());
		System.out.println();
		InsuranceContract3.printcustomerInfo();
		System.out.print(" " + InsurancePolicy3.getPerigrafi());
		System.out.print(" " + InsuranceContract3.getcost());
		System.out.println();
		
		System.out.print(" " + customer1.getName());
		if (InsuranceContract1.cu(0) == customer1.getName()) {
			if (InsuranceContract2.cu(0) == customer1.getName()) { 
			  if (InsuranceContract3.cu(0) == customer1.getName()) {
				  vehicle1.printve(); vehicle2.printve(); vehicle3.printve();
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()+InsuranceContract3.getcost()));
			   }else {
				   vehicle1.printve(); vehicle2.printve();
				   System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()));}
			 }else if (InsuranceContract3.cu(0) == customer1.getName()) {
				  vehicle1.printve(); vehicle3.printve(); 
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract3.getcost()));
			 }else {
				 vehicle1.printve();
				 System.out.print( " " + InsuranceContract1.getcost());}
		}else if (InsuranceContract2.cu(0) == customer1.getName()) {
			   if (InsuranceContract3.cu(0) == customer1.getName()) {
				  vehicle2.printve();vehicle3.printve();
				  System.out.print(" " + (InsuranceContract2.getcost()+InsuranceContract3.getcost()));	
				}else {
					vehicle2.printve();
					System.out.print(" " + InsuranceContract2.getcost());} 
		}else if  (InsuranceContract3.cu(0) == customer1.getName()) { 
			vehicle3.printve();
			System.out.print(" " + InsuranceContract3.getcost());
		}else {System.out.print(" ");}
		
		System.out.println();
		
		System.out.print(" " + customer2.getName());
		if (InsuranceContract1.cu(0) == customer2.getName()) {
			if (InsuranceContract2.cu(0) == customer2.getName()) { 
			  if (InsuranceContract3.cu(0) == customer2.getName()) {
				  vehicle1.printve(); vehicle2.printve(); vehicle3.printve();
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()+InsuranceContract3.getcost()));
			   }else {
				   vehicle1.printve(); vehicle2.printve();
				   System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()));}
			  }else if (InsuranceContract3.cu(0) == customer2.getName()) {
				  vehicle1.printve(); vehicle3.printve();
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract3.getcost()));
				  }else {
					  vehicle1.printve();
					  System.out.print(" " + InsuranceContract1.getcost());}
		}else if (InsuranceContract2.cu(0) == customer2.getName()) {
			   if (InsuranceContract3.cu(0) == customer2.getName()) {
				   vehicle2.printve();vehicle3.printve();
				   System.out.print(" " + (InsuranceContract2.getcost()+InsuranceContract3.getcost()));	
				}else { 
					vehicle2.printve();
					System.out.print("" + InsuranceContract2.getcost());}
		}else if  (InsuranceContract3.cu(0) == customer2.getName()) { 
			vehicle3.printve();
			System.out.print(" " + InsuranceContract3.getcost());
			}else {System.out.print(" ");}	
		
		System.out.println();
		
		System.out.print(" " + customer3.getName());
		if (InsuranceContract1.cu(0) == customer3.getName()) {
			if (InsuranceContract2.cu(0) == customer3.getName()) { 
			  if (InsuranceContract3.cu(0) == customer3.getName()) {
				  vehicle1.printve(); vehicle2.printve(); vehicle3.printve();
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()+InsuranceContract3.getcost()));
			   }else {
				   vehicle1.printve(); vehicle2.printve();
				   System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract2.getcost()));}
			  }else if (InsuranceContract3.cu(0) == customer3.getName()) {
				  vehicle1.printve(); vehicle3.printve();
				  System.out.print(" " + (InsuranceContract1.getcost()+InsuranceContract3.getcost()));
				  }else {
					  vehicle1.printve();
					  System.out.print(" " + InsuranceContract1.getcost());}
		}else if (InsuranceContract2.cu(0) == customer3.getName()) {
			   if (InsuranceContract3.cu(0) == customer3.getName()) {
				   vehicle2.printve();vehicle3.printve();
				   System.out.print(" " + (InsuranceContract2.getcost()+InsuranceContract3.getcost()));	
				}else { 
					vehicle2.printve();
					System.out.print(" " + InsuranceContract2.getcost());}
		}else if  (InsuranceContract3.cu(0) == customer3.getName()) { 
			vehicle3.printve();
			System.out.print(" " + InsuranceContract3.getcost());
			}else {System.out.print(" ");}	 

		
	}

}
