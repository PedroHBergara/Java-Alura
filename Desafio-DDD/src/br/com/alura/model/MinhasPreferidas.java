package br.com.alura.model;

public class MinhasPreferidas {

    public void inclui(Audio a){
        if (a.getClassificacao() >=9){
            System.out.println(a.getTitulo() + "é considerado sucesso absolutoo");

        }else{
            System.out.println(a.getTitulo()+ "tambem é um dos que todo mundo esta curtindo");
        }
    }
}
