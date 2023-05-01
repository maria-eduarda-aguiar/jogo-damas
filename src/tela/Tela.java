package tela;

import tabuleiro.ConsoleColors;
import tabuleiro.Cor;
import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Tela {


    public static void imprimirTabuleiro(Tabuleiro tab) {
        for (int i = 0; i < tab.linhas; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < tab.colunas; j++) {
                Peca peca = tab.getPeca(i, j);
                if (peca == null) {
                    if (isNumeroPar(i)) {
                        if (!isNumeroPar(j)) {
                            System.out.print(ConsoleColors.COR_VERMELHA + "- " + ConsoleColors.COR_BRANCA);
                        } else {
                            System.out.print("- ");
                        }

                    } else {
                        if (isNumeroPar(j)) {
                            System.out.print(ConsoleColors.COR_VERMELHA + "- " + ConsoleColors.COR_BRANCA);

                        } else {
                            System.out.print("- ");
                        }

                    }

                } else {
                    imprimirPeca(tab.getPeca(i, j));
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    public static void imprimirPeca(Peca peca) {
        if (peca.getCor() == Cor.Branca) {
            System.out.print(peca);
        } else {
            System.out.print(ConsoleColors.COR_PRETA + peca + ConsoleColors.COR_BRANCA);

        }
    }

    public static boolean isNumeroPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }
}
