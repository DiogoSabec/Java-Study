package NivelIntermediario.NivelIntermediario3;

public class Main {
    public static void main(String[] args) {

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
        sasuke.SharinganAtivado();

        // Utilizando o construtor de Super e Sub classes
        Uchiha itachi = new Uchiha("Itachi","Folha",18);

        // Obj uchiha 2
        Hatake kakashi = new Hatake();
        kakashi.nome = "kakashi Hatake";
        kakashi.idade = 48;
        kakashi.habilidadeEspecial();
        kakashi.SharinganAtivado();

        // Obj uchiha 3
        Uchiha madara = new Uchiha("Madara","Folha",40,900, NivelNinja.JOUNIN);
        madara.habilidadeEspecial();

    }
}
