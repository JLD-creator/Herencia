package org.ies.employes;

public class Main_Employe {
    public static void main(String[] args) {
        Director_tecnology directorTecnology = new Director_tecnology("125478ñ", "paco", "sanchez", 20);
        //Jefe_proyecto jefe_proyecto = new Jefe_proyecto("478414125j", "lola", "lolita", 34, "");
        Product_manager product_manager = new Product_manager("785418w", "kevin,", "cubo", 43, "futurama");
        Programer programer = new Programer("7412578M", "Bob", "estrella", 78, "Java", "Melancolia");
        directorTecnology.showInfo();
        product_manager.showInfo();
        programer.showInfo();
        directorTecnology.move(45);
        product_manager.move(12);
        programer.move(6);
        programer.language_programer();
    }
}
