import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.next();
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Por favor, digite o nome do Cliente: ");
        sc.nextLine();
        nomeCliente = sc.nextLine().toUpperCase();
        System.out.print("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta "
                + numeroConta + " e seu saldo R$"
                + saldo + " já está disponível para saque.");

        sc.close();
    }

}
