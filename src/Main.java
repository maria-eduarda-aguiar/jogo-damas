import damas.Dama;
import damas.Normal;
import tabuleiro.Cor;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Main {
    public static void main(String[] args) {

        Tabuleiro tab = new Tabuleiro(10, 10);

        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 0));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 2));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 4));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 6));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 8));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(1, 1));
        tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(1, 3));


        Tela.imprimirTabuleiro(tab);
    }

}
