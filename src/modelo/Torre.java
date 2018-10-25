package modelo;

import java.util.ArrayList;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

public class Torre extends Peca {

    public Torre(int cor) {
        super(cor);
    }

    @Override
    public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro) {

        ArrayList<Casa> casas = new ArrayList<Casa>();

        int largura = this.getLargura();
        int altura = this.getAltura();

        int cima = altura - 1;
        int baixo = altura + 1;
        int esquerda = largura - 1;
        int direita = largura + 1;

        while (cima > -1 && (!tabuleiro.getCasaNaPosicao(cima, largura).temPeca() || (!tabuleiro.getCasaNaPosicao(cima, largura).getPeca().temMesmaCor(this)))) {
            Casa c;
            c = tabuleiro.getCasaNaPosicao(cima, largura);

            casas.add(c);
            cima--;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        while (baixo < 8 && (!tabuleiro.getCasaNaPosicao(baixo, largura).temPeca() || (!tabuleiro.getCasaNaPosicao(baixo, largura).getPeca().temMesmaCor(this)))) {
            Casa c;
            c = tabuleiro.getCasaNaPosicao(baixo, largura);

            casas.add(c);
            baixo++;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        while (esquerda > -1 && (!tabuleiro.getCasaNaPosicao(altura, esquerda).temPeca() || (!tabuleiro.getCasaNaPosicao(altura, esquerda).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(altura, esquerda);

            casas.add(c);
            esquerda--;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        while (direita < 8 && (!tabuleiro.getCasaNaPosicao(altura, direita).temPeca() || (!tabuleiro.getCasaNaPosicao(altura, direita).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(altura, direita);

            casas.add(c);
            direita++;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        casas.add(this.casa);

        return casas;
    }

    @Override
    public String getPecaIcone() {
        if (this.cor == Peca.BRANCA) {
            return "t";
        } else {
            return "T";
        }
    }
}