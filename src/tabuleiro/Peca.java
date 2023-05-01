package tabuleiro;

public class Peca {
    public Posicao posicao;
    private Cor cor;
    private int qteMovimentos;
    private Tabuleiro tab;

    public Peca(Tabuleiro tab, Cor cor) {
        this.posicao = null;
        this.tab = tab;
        this.cor = cor;
        this.qteMovimentos = 0;
    }

    public void incrementarQteMovimentos() {
        qteMovimentos++;
    }

    public Tabuleiro getTab() {
        return tab;
    }

    protected void setTab(Tabuleiro tab) {
        this.tab = tab;
    }

    public Cor getCor() {
        return cor;
    }

    protected void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQteMovimentos() {
        return qteMovimentos;
    }

    protected void setQteMovimentos(int qteMovimentos) {
        this.qteMovimentos = qteMovimentos;
    }
}
