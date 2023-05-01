package damas;

import tabuleiro.Cor;
import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Dama extends Peca {
    public Dama(Tabuleiro tab, Cor cor) {
        super(tab, cor);
    }
    @Override
    public String toString(){
        return "D";
    }
}
