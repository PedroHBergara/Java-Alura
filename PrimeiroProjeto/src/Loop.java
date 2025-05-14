import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        double mediaAvaliacao= 0;
        double nota=0;

        for (i = 0 ; i <3; i++){
            System.out.println("Digite a sua avaliacao do filme: ");
            nota  = scanner.nextDouble();
            mediaAvaliacao += nota ;
        }

        System.out.println("Media das avaliacoes: " + mediaAvaliacao/3);


    }
}
