package Modelos;

public class Jogo {
    public int[][] posicoes = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private boolean vezJogador = true;
    public int ganhou;

    public boolean getVezJogador() {
        return vezJogador;
    }

    public void setVezJogador(boolean vezJogador) {
        this.vezJogador = vezJogador;
    }
}
