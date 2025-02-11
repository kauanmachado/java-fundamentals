import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero = s.nextInt();

        s.nextLine();

        System.out.println("Por favor, digite o número da agencia: ");
        agencia = s.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = s.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = s.nextDouble();

        s.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
