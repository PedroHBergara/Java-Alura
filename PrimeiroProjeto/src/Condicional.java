public class Condicional {

    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean condicao = true;
        double notaDoFilme = 8.1;
        String tipoPLano = "PLUS";

        if (anoLancamento >= 2022){
            System.out.println("Lancamento recente");
        }
        else{
            System.out.println("Filme retro ");
        }

        if (condicao ==true || tipoPLano.equals("PLUS")){
            System.out.println("Filme liberado");

        }else{
            System.out.println("deve pagar para assistir");
        }

        if(condicao == true && tipoPLano.equals("PLUS")){
            System.out.println("voce pode assisitir");
        }else{
            System.out.println("deve pagar para assistir");
        }



    }
}
