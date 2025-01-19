package NivelIntermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.aldeia = "Folha";

        // Objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Folha";
        sasuke.idade = 18;
        sasuke.SharinganAtivado();

        // Objeto 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.aldeia = "Folha";
        sakura.idade = 18;

        // Objeto 4
        Ninja hinata = new Ninja();
        hinata.nome = "Hinata";
        hinata.aldeia = "Folha";
        hinata.idade = 18;


    }

}
