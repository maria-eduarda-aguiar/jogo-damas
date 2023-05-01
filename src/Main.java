import damas.Normal;
import damas.PartidaDamas;
import tabuleiro.*;
import tela.Tela;

public class Main {
    public static void main(String[] args) throws TabuleiroException {
        try {

            PartidaDamas partida = new PartidaDamas();
            while (!partida.isTerminada()) {
                Tela.imprimirTabuleiro(partida.getTab());
                System.out.println();
                System.out.print("Origem: ");
                Posicao origem = Tela.lerPosicaoDamas().toPosicao();
                System.out.print("Destino: ");
                Posicao destino = Tela.lerPosicaoDamas().toPosicao();


                clearConsole();
                partida.executaMovimento(origem, destino);
            }

            /*
            String c = "Aarrasda";
            int t = 'b' - 'a';
            String test = String.valueOf((char)(2 + 64));

            System.out.print(t + 1);
            */

            Tela.imprimirTabuleiro(partida.getTab());
        } catch (TabuleiroException err) {
            System.out.println(err.getMessage());
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");

            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
