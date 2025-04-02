import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        //Mensagem de boas-vindas128
        System.out.println("Bem-vindo ao Banco Java! Vamos criar sua conta!");

        //TODO: Exibir as mensagens para o usuário e obter os valores digitados
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}