package NivelFacil.TiposDeDados;

public class Array2 {
    public static void main(String[] args) {

        // Uma das maneiras de inicializar o Array
        String[][] ninjasEAldeias1 = new String[3][3];
        ninjasEAldeias1[0][0] = "Konoha";
        ninjasEAldeias1[0][1] = "Naruto";
        ninjasEAldeias1[0][2] = "Sasuke";

        ninjasEAldeias1[1][0] = "Nevoa";
        ninjasEAldeias1[1][1] = "Zabuza";
        ninjasEAldeias1[1][2] = "Haku";

        ninjasEAldeias1[2][0] = "Deserto";
        ninjasEAldeias1[2][1] = "Gaara";
        ninjasEAldeias1[2][2] = "Tenari";

        for (int i = 0; i < ninjasEAldeias1.length; i++) {
            System.out.println(ninjasEAldeias1[i][1]);
        }

        // Outra maneira de inicializar o Array. Veja que assim não precisamos colocar o Número de linhas e colunas que o Array vai ter.
        String[][] aldeiasENinjas2 = {
                {"Aldeia da Folha", "Naruto", "Sasuke", "Sakura"},
                {"Aldeia da Areia", "Gaara", "Kankuro", "Temari"},
                {"Aldeia da Névoa", "Zabuza", "Haku"},
                {"Aldeia da Nuvem", "Darui", "C"},
                {"Aldeia da Pedra", "Kurotsuchi", "Akatsuchi"}
        };
        for (int i = 0; i < aldeiasENinjas2.length; i++) {
            System.out.println(aldeiasENinjas2[i][1]);
        }

    }
}
