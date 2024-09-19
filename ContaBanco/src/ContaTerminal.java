import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // configura o Scanner para usar o padrão BR, que aceita vírgula como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));
        
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine(); //codigo para colocar informações citadas como exemplo
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número do seu Saldo (ex: R$1234,56) !"); //indica ao cliente para usar virgula
        double saldo = scanner.nextDouble();
        //mostrar os dados recolhidos do cliente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        //fechar o scanner para evitar erros
        scanner.close();
    }
}