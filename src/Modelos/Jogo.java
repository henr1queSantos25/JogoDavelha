package Modelos;

public class Jogo {
    public int[][] posicoes = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private boolean vezJogador = true;
    public int ganhou;
    private String nomeJogador1;
    private String nomeJogador2;

    public boolean getVezJogador() {
        return vezJogador;
    }

    public void setVezJogador(boolean vezJogador) {
        this.vezJogador = vezJogador;
    }

	public String getNomeJogador1() {
		return nomeJogador1;
	}

	public void setNomeJogador1(String nomeJogador1) {
		this.nomeJogador1 = nomeJogador1;
	}

	public String getNomeJogador2() {
		return nomeJogador2;
	}

	public void setNomeJogador2(String nomeJogador2) {
		this.nomeJogador2 = nomeJogador2;
	}
}
