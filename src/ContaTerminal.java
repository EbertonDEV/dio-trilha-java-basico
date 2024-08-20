import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o numero da Agencia!");
        String agencia = scanner.next();
        
        System.out.println("Digite o numero da conta!");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Digite Seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo!");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agencia é " + agencia + " !");
        System.out.println("Sua Conta " + numeroConta + " !");
        System.out.println("Seu saldo "+ saldo + " Ja esta disponivel para saque!");
    }
}
