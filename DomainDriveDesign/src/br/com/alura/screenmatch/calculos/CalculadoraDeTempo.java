package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int gettempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos() ;
//    }
//
//    public void inclui(Serie s ) {
//        this.tempoTotal += s.getDuracaoEmMinutos() ;
//    }

    public void inclui (Titulo t){
        System.out.println("adicionando duracao em minutos de " + t );
        this.tempoTotal += t.getDuracaoEmMinutos();

    }

}
