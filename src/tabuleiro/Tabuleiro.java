package tabuleiro;

public class Tabuleiro {

    public int linhas;
    public int colunas;

    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public Peca getPeca(int linha, int coluna){
        return pecas[linha][coluna];
    }

    public int getLinha() {
        return linhas;
    }

    public void setLinha(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
}
