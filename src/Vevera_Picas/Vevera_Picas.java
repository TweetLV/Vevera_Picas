package Vevera_Picas;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Vevera_Picas {
    public static void lielums () {
    	 DecimalFormat df = new DecimalFormat("#.##");
    	double cena=0;
    	String izmers = JOptionPane.showInputDialog("Ievadi picas izmēru diametrā(cm) (20, 30, 50)");
    	switch(izmers) {
        case "20":
     	   cena=4.99;
     	   JOptionPane.showMessageDialog(null, "Cena ir 4.99.");
     	   break;
        case "30":
     	   cena= 6.99;
     	   JOptionPane.showMessageDialog(null, "Cena ir 6.99");
     	   break;
        case "50":
        	cena = 11.99;
        	 JOptionPane.showMessageDialog(null, "Cena ir 11.99");
        	 break;
        default:
        	cena=6.99;
        	JOptionPane.showMessageDialog(null, "Izvēlējies nepareizu izmēru, tapēc izvēlējāmies jums 30 cm picu.");
       }
    }

    public static void piedevas() {

    }

    public static void piegade() {
    	 DecimalFormat df = new DecimalFormat("#.##");
    	
        double piegadesCena = 0;
       String attalums = JOptionPane.showInputDialog("Ievadi vai picu savāksiet klātienē vai būs piegāde(0 priekš klātienes, 1 priekš piegādes)");
       switch(attalums) {
       case "0":
    	   piegadesCena=0;
    	   JOptionPane.showMessageDialog(null, "Piegādes cena nav.");
    	   break;
       case "1":
    	   piegadesCena= 2.50;
    	   JOptionPane.showMessageDialog(null, "Piegades cena ir: " + df.format(piegadesCena));
    	   break;
      }
       }
    

public static void galacena() {

    }


    public static void main(String[] args) {
        String izvele;
        DecimalFormat df = new DecimalFormat("#.##");
        do {
        izvele= JOptionPane.showInputDialog(" 1 - Picas lielums | 2 - Picas piedevas | 3 - Picas piegāde | 4 - Pasūtijuma cena | 0 - Atcelt pasūtijumu ");
        switch(izvele){
        case "1":
            lielums();
            break;
        case "2":
            piedevas();
            break;
        case "3":
            piegade();
            break;
        case "4":
            galacena();
            break;
        case "0":
            JOptionPane.showMessageDialog(null, "Pasūtijums atcelts!");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Šāda izvēle nepastāv!","Kļūme!",JOptionPane.WARNING_MESSAGE);
        }
    }while(!izvele.equals("0"));
}

}