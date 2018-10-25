package modelo;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;

public class Rei extends Peca {

    public Rei(int cor){
        super(cor);
    }

    /*@Override
    public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){

        ArrayList<Casa> casas = new ArrayList<Casa>();

        int largura = this.getLargura();
        int altura = this.getAltura();

        int cima = altura-1;

        while(cima > -1){
            Casa c = tabuleiro.getCasaNaPosicao(cima,largura);

            casas.add(c);
            cima--;
        }

        casas.add(this.casa);

        return casas;
    }*/

    @Override
    public String getPecaIcone(){
        if(this.cor == Peca.BRANCA){
            return "k";
        }else{
            return "K";
        }
    }
}
