//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static void main(String[] args) {
        //escrevendo a primeira linha de codigo
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun:Maverick");
        //crianco variavel
        int anoDeLancamento = 2022;
        //mostrando dado da variavel
        System.out.println(" ano de lancamento"+ anoDeLancamento);
        //variavel booleana com valor de true e false
        boolean Include = true;
        //criando valor com ponto flutuante
        double rate = 8.5;
        //criando variavel string
        String movieName = "Top Gun: Maverick";
        String sinopse = """
                Top Gun 
                Filme de aventura com um gala do anos 90
                Ano de Lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        double media = (9.8 + 6.3 + 8.0) /3 ;
        System.out.println("media " + media);
        int classificacao;
        //cast explicito
        classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}