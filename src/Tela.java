import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Tela {
    public static void imprimirTabuleiro(Tabuleiro tab) {
        for (int i = 0; i < tab.linhas; i++) {
            for (int j = 0; j < tab.colunas; j++) {
                Peca peca = tab.getPeca(i, j);
                if (peca == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(peca + " ");
                }

            }
            System.out.println();
        }

    }
}
