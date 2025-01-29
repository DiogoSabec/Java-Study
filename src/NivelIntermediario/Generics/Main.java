package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        // Maneira 01 de fazer generics
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        // Esse permite qualquer EquipamentosNinja a ficar dentro da bolsa
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarFerramenta(kunai);
        bolsaGenerica.adicionarFerramenta(shuriken);
        bolsaGenerica.adicionarFerramenta(pergaminho);

        System.out.println(bolsaGenerica);

        // Maneira 02 de fazer generics
        // Esse permite QUALQUER OBJETO a ficar dentro da bolsa
        BolsaGenerica<Object> bolsaNinja = new BolsaGenerica<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai"));
        bolsaNinja.adicionarFerramenta(new Shuriken(5));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocar sapo"));
        bolsaNinja.adicionarFerramenta(new CompanheiroAnimal("Sapo"));

        bolsaNinja.mostrarFerramentas();
    }
}
