package NivelIntermediario.GetttersSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 18, 50);
        System.out.println("Meu nome é " + naruto.getNome());

        System.out.println("--------------- Sasuke Uchiha ---------------");
        Uchiha sasuke = new Uchiha("Sasuke","Folha",19,30);
    }
}
