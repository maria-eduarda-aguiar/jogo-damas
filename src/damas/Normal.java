package damas;

import tabuleiro.Cor;
import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Normal extends Peca {

    public Normal(Tabuleiro tab, Cor cor) {
        super(tab, cor);
    }

    @Override
    public String toString(){

        if(this.getCor() == Cor.Branca){
            return "b";
        }
        return "p";
    }
}
