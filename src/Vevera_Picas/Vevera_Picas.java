package Vevera_Picas;

import javax.swing.JOptionPane;

public class Vevera_Picas {
    public static void lielums () {

    }

    public static void piedevas() {

    }

    public static void piegade() {

    }

public static void galacena() {

    }


    public static void main(String[] args) {
        String izvele;
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