import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favorite;
        int anoLancamento;
        double nota;

        System.out.println("Excreva seu filme favorito: ");
        favorite = scanner.nextLine();
        System.out.println("seu filme favorito é " + favorite);


        System.out.println("Digite o ano de lancamento: ");
        anoLancamento = scanner.nextInt();
        System.out.println("ano de lancmento" + anoLancamento);


        System.out.println("Digite a seu nota para esse filme: ");
        nota = scanner.nextDouble();
        System.out.println("A sua nota para o filme é " + nota);


    }
}
