package principal;

//imports para as classes do jar "poo_tabuleiro"
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.DesenharTabuleiro;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.EstiloTabuleiro;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

import modelo.*;

public class Main{
	public static void main(String[] args){
		
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		EstiloTabuleiro estilo = new EstiloTabuleiro();

		Peca pb1 = new Peao(Peca.BRANCA);
		Peca pb2 = new Peao(Peca.BRANCA);
		Peca pb3 = new Peao(Peca.BRANCA);
		Peca pb4 = new Peao(Peca.BRANCA);
		Peca pb5 = new Peao(Peca.BRANCA);
		Peca pb6 = new Peao(Peca.BRANCA);
		Peca pb7 = new Peao(Peca.BRANCA);
		Peca pb8 = new Peao(Peca.BRANCA);

		Peca tb1 = new Torre(Peca.BRANCA);
		Peca tb2 = new Torre(Peca.BRANCA);

        Peca cb1 = new Cavalo(Peca.BRANCA);
        Peca cb2 = new Cavalo(Peca.BRANCA);

        Peca bb1 = new Bispo(Peca.BRANCA);
        Peca bb2 = new Bispo(Peca.BRANCA);

        Peca qb = new Rainha(Peca.BRANCA);
        Peca kb = new Rei(Peca.BRANCA);

		tabuleiro.addPeca(pb1, 1, 0);
		tabuleiro.addPeca(pb2, 1, 1);
		tabuleiro.addPeca(pb3, 1, 2);
		tabuleiro.addPeca(pb4, 1, 3);
		tabuleiro.addPeca(pb5, 1, 4);
		tabuleiro.addPeca(pb6, 1, 5);
		tabuleiro.addPeca(pb7, 1, 6);
		tabuleiro.addPeca(pb8, 1, 7);

		tabuleiro.addPeca(tb1, 0, 0);
		tabuleiro.addPeca(tb2, 0, 7);

		tabuleiro.addPeca(cb1, 0, 1 );
        tabuleiro.addPeca(cb2, 0, 6 );

        tabuleiro.addPeca(bb1, 0, 2 );
        tabuleiro.addPeca(bb2, 0, 5 );

        tabuleiro.addPeca(qb, 0, 3 );
        tabuleiro.addPeca(kb, 0, 4 );

		Peca pp1 = new Peao(Peca.PRETA);
		Peca pp2 = new Peao(Peca.PRETA);
		Peca pp3 = new Peao(Peca.PRETA);
		Peca pp4 = new Peao(Peca.PRETA);
		Peca pp5 = new Peao(Peca.PRETA);
		Peca pp6 = new Peao(Peca.PRETA);
		Peca pp7 = new Peao(Peca.PRETA);
		Peca pp8 = new Peao(Peca.PRETA);

        Peca tp1 = new Torre(Peca.PRETA);
        Peca tp2 = new Torre(Peca.PRETA);

        Peca cp1 = new Cavalo(Peca.PRETA);
        Peca cp2 = new Cavalo(Peca.PRETA);

        Peca bp1 = new Bispo(Peca.PRETA);
        Peca bp2 = new Bispo(Peca.PRETA);

        Peca qp = new Rainha(Peca.PRETA);
        Peca kp = new Rei(Peca.PRETA);

		tabuleiro.addPeca(pp1, 6, 0);
		tabuleiro.addPeca(pp2, 6, 1);
		tabuleiro.addPeca(pp3, 6, 2);
		tabuleiro.addPeca(pp4, 6, 3);
		tabuleiro.addPeca(pp5, 6, 4);
		tabuleiro.addPeca(pp6, 6, 5);
		tabuleiro.addPeca(pp7, 6, 6);
		tabuleiro.addPeca(pp8, 6, 7);

		tabuleiro.addPeca(tp1, 7, 0);
		tabuleiro.addPeca(tp2, 7, 7);

        tabuleiro.addPeca(cp1, 7, 1);
        tabuleiro.addPeca(cp2, 7, 6);

        tabuleiro.addPeca(bp1, 7, 2);
        tabuleiro.addPeca(bp2, 7, 5);

        tabuleiro.addPeca(qp, 7, 3);
        tabuleiro.addPeca(kp, 7, 4);

		//tp1.selecionar();
        //bp1.selecionar();

        //tb1.selecionar();
        //bb1.selecionar();
		
		tabuleiro.atualizar();
		
		//para este exercício, estas duas linhas não devem ser mexidas.
		DesenharTabuleiro saida = new DesenharTabuleiro();
		saida.desenhar(tabuleiro, estilo);
	}
}