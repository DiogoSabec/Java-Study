package NivelIntermediario.Generics;

public class CompanheiroAnimal {
    private String nomeDoAnimal;

    public CompanheiroAnimal() {
    }

    public CompanheiroAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return nomeDoAnimal;
    }
}
