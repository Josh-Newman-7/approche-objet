package fr.diginamic.TP_PO_V2;

public class TestIntervenant {
    public static void main(String[] args) {
        SalarieIntervenant salarie = new SalarieIntervenant("Smith", "John", 2500.0);
        System.out.println("Salaire du salarié : " + salarie.getSalaire());
        salarie.afficherDonnees();

        Pigiste pigiste = new Pigiste("Smith", "Jane", 15, 100.0);
        System.out.println("Salaire du pigiste : " + pigiste.getSalaire());
        pigiste.afficherDonnees();
    }
}