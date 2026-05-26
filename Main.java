
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arxeia_Ekthesewn_Pragmatognomosynhs arxeio1=new Arxeia_Ekthesewn_Pragmatognomosynhs(2134,"12/05/2024");
		Arxeia_Ekthesewn_Pragmatognomosynhs arxeio2=new Arxeia_Ekthesewn_Pragmatognomosynhs(2004,"12/07/2024");

		
		Katalogos_Arxeiwn kat1=new Katalogos_Arxeiwn();
		kat1.Kataxwrhsh_arxeiwn(arxeio1);
		kat1.Kataxwrhsh_arxeiwn(arxeio2);

		
		Dioikhtikos_Ypallhlos d1=new Dioikhtikos_Ypallhlos("Αντωνίου Πέτρος",2312);
		d1.printData();
		System.out.println("\n");
		
		Eggrafo_pelath eg1=new Eggrafo_pelath(3245,"eidos1","18/08/2024",true);
		eg1.printData();
		System.out.println("\n");
		
		Troxaia tr=new Troxaia(2363,eg1);
		tr.printData();
		System.out.println("\n");
		tr.Lipsi_Eggrafon();
		System.out.println("\n");
		
		Stoixeia_Pelath st1=new Stoixeia_Pelath("Παπαδόπουλος Γιάννης","01/04/1998","Τσιμισκή 10",567834);
		Stoixeia_Pelath st2=new Stoixeia_Pelath("Πέτρου Νίκος","01/08/2000","Μπότσαρη 10",64574);
		Stoixeia_Oxhmatos ox1=new Stoixeia_Oxhmatos(1234,"BMW X1","BMW","μαύρο",1000);
		Stoixeia_Oxhmatos ox2=new Stoixeia_Oxhmatos(7436,"BMW X3","BMW","λευκό",2000);
		
		
		Paketo_Asfalisis p1=new Paketo_Asfalisis("Νέα ασφάλεια");
		Paketo_Asfalisis p2=new Paketo_Asfalisis("Ανανέωση ασφάλειας");
		
		p1.Afise_idio_paketo();
		System.out.println("\n");
		p1.Allakse_to_paketo();
		System.out.println("\n");
		p1.anazitaei_kai_emfanizei();
		System.out.println("\n");
		p1.Epilekse_epeksergasia_asfaleias();
		System.out.println("\n");
		

		Fakelos f1=new Fakelos(true,535,"31/04/2024",p1,st1,ox1);
		f1.printData();
		System.out.println("\n");
		f1.Anaktise("Παπαδόπουλος Γιάννης");
		f1.dhmiourgei();
		System.out.println("\n");
		f1.Epilogi_Asfaleia_Oximatos();
		System.out.println("\n");
		f1.printData();
		System.out.println("\n");
		Fakelos f2=new Fakelos(true,500,"14/04/2024",p2,st2,ox2);
		f2.printData();
		System.out.println("\n");
		f2.dhmiourgei();
		System.out.println("\n");
		f2.Anaktise("Πέτρου Νίκος");
		System.out.println("\n");
		
		Katalogos_Pelath k=new Katalogos_Pelath();
		k.addFakelos(f1);
		k.addFakelos(f2);
		Praktoras prakt=new Praktoras(5356,"Νίκου",f1,eg1,arxeio1);
		prakt.printData();
		System.out.println("\n");
		
		Skanarismena_eggrafa s1=new Skanarismena_eggrafa("είδος1","18/08/2024",true,prakt);
		Skanarismena_eggrafa s2=new Skanarismena_eggrafa("είδος2","08/03/2024",true,prakt);
		
		Entipo ent=new Entipo();
		ent.addEggrafo(s1);
		ent.addEggrafo(s2);
		Statistika_Stoixeia stat=new Statistika_Stoixeia(76,3);
		
		Pragmatognomonas pr=new Pragmatognomonas(647,"Νικολάου",arxeio1,stat);
		pr.printData();
		System.out.println("\n");
		
		Idiokthths id1=new Idiokthths(432,"Σωτηρίου",stat);
		id1.printData();
		System.out.println("\n");
		
		Asfalistikh_Etairia asf=new Asfalistikh_Etairia(6456,eg1);
		asf.Apostoli_Eggrafon();
		System.out.println("\n");
		asf.Lipsi_Eggrafon();
		System.out.println("\n");
		asf.printData();
		System.out.println("\n");
		
		k.printData();
		System.out.println("\n");
		ent.printData();
		System.out.println("\n");
		kat1.printData();
	}

}
