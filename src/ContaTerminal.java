import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o número da agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 237.48; 

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
