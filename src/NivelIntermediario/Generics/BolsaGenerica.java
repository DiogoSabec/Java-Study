package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> ferramentas;

    public BolsaGenerica() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramentas na lista
    public void adicionarFerramenta (T ferramenta){
        ferramentas.add(ferramenta);
    }

    // Mostrar ferramentas
    public void mostrarFerramentas() {
        for (T ferrramenta : ferramentas) {
            System.out.println(ferrramenta);
        }
    }
}