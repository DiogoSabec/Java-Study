package NivelIntermediario.NivelIntermediario1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.aldeia = "Folha";
        naruto.ModoSabio();

        // Objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Folha";
        sasuke.idade = 18;
        sasuke.SharinganAtivado();
        sasuke.HabilidadeEspecial();

        // Objeto 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.aldeia = "Folha";
        sakura.idade = 18;
        sakura.AtivarCura();

        // Objeto 4
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.aldeia = "Folha";
        hinata.idade = 18;
        hinata.AtivarByakugan();

        // Objeto 5
        Hyuga boruto = new Hyuga();
        boruto.nome = "Boruto";
        boruto.aldeia = "Folha";
        boruto.idade = 99;
        boruto.AtivarByakugan();


    }

}
