import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 2500.00;
        String nome = "Sample";
        String tipoConta = "corrente";
        int opcao = 0;

        String atributosConta = """
                *******************************************************
                Dados iniciais do cliente:
                
                Nome:                       %s
                Tipo de conta:              %s
                Saldo inicial:              R$ %.2f
                *******************************************************
                """.formatted(nome, tipoConta, saldo);

        System.out.println(atributosConta);

        String operacoes = """
                
                
                Operações:
               
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println(atributosConta);
            } else if (opcao == 2) {
                System.out.println("Qual o valor à receber?");
                double valor = scanner.nextInt();
                saldo = saldo + valor;
                System.out.println("O saldo atualizado é R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o valor à transferir?");
                double valorTrans = scanner.nextInt();
                if (valorTrans > saldo) {
                    System.out.println("Transferência recusada. Saldo insuficiente.");
                } else {
                    saldo = saldo - valorTrans;
                    System.out.println("Transferência realizada");
                    System.out.println("O saldo atualizado é R$ " + saldo);
                }
            }
        }
    }
}
