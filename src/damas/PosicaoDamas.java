package damas;

import tabuleiro.Posicao;

public class PosicaoDamas {
    public char coluna;
    public int linha;

    public PosicaoDamas(char coluna, int linha){
        this.coluna = coluna;
        this.linha = linha;
    }

    public Posicao toPosicao(){
        return new Posicao(8 - linha, Character.toUpperCase(coluna) - 'A');
    }

    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
