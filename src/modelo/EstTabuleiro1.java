package modelo;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.EstiloTabuleiro;

public class EstTabuleiro1 extends EstiloTabuleiro {

    @Override
    protected void criarColuna() {
        this.coluna = "!";
    }

    @Override
    protected void criarDepoisCasaSelecionada() {
        this.depoisCasaSelecionada = "*";
    }

    @Override
    protected void criarAntesCasaSelecionada() {
        this.antesCasaSelecionada = "*";
    }

    @Override
    public void processar() {
        super.processar();
        String tabuleiro = this.desenhar();
        System.out.println(tabuleiro);
    }
}
