package modelo;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

import java.util.ArrayList;

public class Bispo extends Peca {

    public Bispo(int cor) {
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

        while (cima > -1 && (!tabuleiro.getCasaNaPosicao(cima, direita).temPeca() || (!tabuleiro.getCasaNaPosicao(cima, direita).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(cima, direita);

            casas.add(c);
            cima--;
            direita++;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        cima = altura - 1;

        while (cima > -1 && (!tabuleiro.getCasaNaPosicao(cima, esquerda).temPeca() || (!tabuleiro.getCasaNaPosicao(cima, esquerda).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(cima, esquerda);

            casas.add(c);
            cima--;
            esquerda--;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        direita = largura + 1;

        while (baixo < 8 && (!tabuleiro.getCasaNaPosicao(baixo, direita).temPeca() || (!tabuleiro.getCasaNaPosicao(baixo, direita).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(baixo, direita);

            casas.add(c);
            baixo++;
            direita++;

            if (c.temPeca() && !c.getPeca().temMesmaCor(this)) {
                break;
            }
        }

        baixo = altura + 1;
        esquerda = largura - 1;

        while (baixo < 8 && (!tabuleiro.getCasaNaPosicao(baixo, esquerda).temPeca() || (!tabuleiro.getCasaNaPosicao(baixo, esquerda).getPeca().temMesmaCor(this)))) {
            Casa c = tabuleiro.getCasaNaPosicao(baixo, esquerda);

            casas.add(c);
            baixo++;
            esquerda--;

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
            return "b";
        } else {
            return "B";
        }
    }
}
