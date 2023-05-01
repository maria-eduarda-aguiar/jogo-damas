package tabuleiro;

public class Posicao {
    public int linha;
    public int coluna;

    public Posicao(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }
    @Override
    public String toString(){
        return linha + ", " + coluna;
    }
}
