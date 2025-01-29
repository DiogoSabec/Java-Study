package NivelIntermediario.Generics;

public class Shuriken {
    private int tamanho;

    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public Shuriken() {
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho " + tamanho;
    }
}
