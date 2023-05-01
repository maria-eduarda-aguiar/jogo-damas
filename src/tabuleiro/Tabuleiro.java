package tabuleiro;


import tela.Tela;

public class Tabuleiro {

    public int linhas;
    public int colunas;

    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public Peca getPeca(int linha, int coluna) {
        return pecas[linha][coluna];
    }

    public Peca getPeca(Posicao pos) {
        return pecas[pos.linha][pos.coluna];
    }

    public boolean isEspacoOcupado(Posicao pos) throws TabuleiroException {
        validarPosicao(pos);
        return getPeca(pos) != null;
    }

    public boolean isPosicaoValida(Posicao pos) {
        if (pos.linha < 0 || pos.linha >= linhas || pos.coluna < 0 || pos.coluna >= colunas) {
            return false;
        }
        if (Tela.isNumeroPar(pos.linha) && Tela.isNumeroPar(pos.coluna) || !Tela.isNumeroPar(pos.linha) && !Tela.isNumeroPar(pos.coluna)) {
            return false;
        }
        return true;
    }

    public void validarPosicao(Posicao pos) throws TabuleiroException {
        if (!isPosicaoValida(pos)) {
            throw new TabuleiroException("Posição inválida!");
        }
    }

    public void colocarPeca(Peca p, Posicao pos) throws TabuleiroException {
        if (isEspacoOcupado(pos)) {
            throw new TabuleiroException("Já existe uma peça nessa posição!");
        }
        pecas[pos.linha][pos.coluna] = p;
        p.posicao = pos;
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
