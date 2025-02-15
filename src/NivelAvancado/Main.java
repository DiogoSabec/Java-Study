package NivelAvancado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("naruto","folha",17));
        ninjas.add(new Ninja("sasuke","folha",16));
        ninjas.add(new Ninja("sakura","folha",16));
        ninjas.add(new Ninja("minato","vento",17));
        ninjas.add(new Ninja("kakashi","ar",16));
        ninjas.add(new Ninja("hinata","ha",17));
        ninjas.add(new Ninja("kiba","alha",17));
        ninjas.add(new Ninja("tenten","foaa",18));
        ninjas.add(new Ninja("shikamaru","folha",18));

        // Substitui o for()
/*        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("folha"))
                .forEach(System.out::println);  // soutc
    */


        // Ordenação idade
        ninjas.stream()
                .sorted((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("---------------");

        // Ordenação nome
        ninjas.stream()
                .sorted((n1,n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        System.out.println("---------------");

        // MAP
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        System.out.println("---------------");

        // MAX - Ninja mais velho
        Ninja ninjaVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println("ninjaVelho = " + ninjaVelho);
    }
}
