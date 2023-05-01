import damas.Normal;
import tabuleiro.*;
import tela.Tela;

public class Main {
    public static void main(String[] args) throws TabuleiroException {


        try{
            Tabuleiro tab = new Tabuleiro(8, 8);

            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 1));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 3));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 5));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(0, 7));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(1, 0));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(1, 2));
            tab.colocarPeca(new Normal(tab, Cor.Preta), new Posicao(1, 4));


            Tela.imprimirTabuleiro(tab);


        }catch(TabuleiroException err){
            System.out.println(err.getMessage());
        }


    }


}
