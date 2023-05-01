package damas;

import tabuleiro.*;

public class PartidaDamas {

    private Tabuleiro tab;
    private int turno;
    private Cor jogadorAtual;
    private boolean terminada;

    public PartidaDamas() throws TabuleiroException {
        tab = new Tabuleiro(8, 8);
        turno = 1;
        jogadorAtual = Cor.Branca;

        colocarPecas();
    }

    public void executaMovimento(Posicao origem, Posicao destino) throws TabuleiroException {
        Peca p = tab.retirarPeca(origem);
        p.incrementarQteMovimentos();

        Posicao pecaAlvo;
        if (p.getCor() == Cor.Branca) {
            pecaAlvo = new Posicao(destino.linha - 1, origem.coluna < destino.coluna ? destino.coluna - 1 : destino.coluna + 1);
        } else {
            pecaAlvo = new Posicao(destino.linha + 1, origem.coluna < destino.coluna ? destino.coluna - 1 : destino.coluna + 1);
        }
        Peca pecaCapturada = tab.retirarPeca(pecaAlvo);
        tab.colocarPeca(p, destino);
    }

    private void colocarPecas() throws TabuleiroException {

        tab.colocarPeca(new Normal(tab, Cor.Branca), new PosicaoDamas('B', 2).toPosicao());
        tab.colocarPeca(new Normal(tab, Cor.Preta), new PosicaoDamas('B', 4).toPosicao());
    }

    public Tabuleiro getTab() {
        return tab;
    }

    private void setTab(Tabuleiro tab) {
        this.tab = tab;
    }

    public boolean isTerminada() {
        return terminada;
    }

    private void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }
}
