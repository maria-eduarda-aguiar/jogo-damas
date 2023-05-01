package tela;

import damas.PosicaoDamas;
import tabuleiro.*;

import java.util.Scanner;

public class Tela {

    public static void imprimirTabuleiro(Tabuleiro tab) {
        for (int i = 0; i < tab.linhas; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < tab.colunas; j++) {
                Peca peca = tab.getPeca(i, j);
                if (peca == null) {

                    System.out.print("- ");
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

        System.out.print(peca);

    }

    public static boolean isNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    public static PosicaoDamas lerPosicaoDamas() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char coluna = s.charAt(0);
        int linha = Integer.parseInt(String.valueOf(s.charAt(1)));

        return new PosicaoDamas(coluna, linha);
    }
}
