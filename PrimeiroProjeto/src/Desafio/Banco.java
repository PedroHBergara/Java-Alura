package Desafio;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int op = 0;
        double saldo = 1000;
        double deposito = 0;
        double transferencia = 0;

        while( op != 4){
            System.out.println("""
                    1- Consultar saldos 
                    2- receber valor 
                    3- transferir valor 
                    4- sair
                    
                    Digite a opcao desejada
                    """);
            op = scanner.nextInt();
            if(op ==1 ){
                System.out.println("este é o seu saldo :R$" + saldo);
            }else if (op == 2) {

                System.out.println("Digite o valor que ira receber: ");
                deposito = scanner.nextDouble();
                saldo+= deposito;

            }else if (op == 3) {
                System.out.println("Digite o valor que sera tranferido: ");
                transferencia = scanner.nextDouble();
                if (saldo > transferencia) {
                    System.out.println("Transferencia realizado com sucesso ");
                    System.out.println("Saldo atual "+ saldo);
                    saldo = saldo - transferencia;
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else {
                System.out.println("opcao invalida");
            }

        }


    }
}
