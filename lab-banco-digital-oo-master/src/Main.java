
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Criar um banco
        Banco banco = new Banco();
        banco.setNome("Banco Example");
        banco.setContas(new ArrayList<>());

        // Criar clientes
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        // Criar contas
        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton);
        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        // Adicionar contas ao banco
        banco.getContas().add(ccVenilton);
        banco.getContas().add(poupancaVenilton);
        banco.getContas().add(ccMaria);
        banco.getContas().add(poupancaMaria);

        // Realizar operações
        ccVenilton.depositar(1000);
        ccVenilton.transferir(200, poupancaVenilton);

        ccMaria.depositar(1500);
        ccMaria.transferir(300, poupancaMaria);

        // Imprimir extratos iniciais
        System.out.println("=== Extratos Iniciais ===");
        ccVenilton.imprimirExtrato();
        poupancaVenilton.imprimirExtrato();
        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        // Aplicar rendimento nas contas poupança
        System.out.println("\n=== Aplicando Rendimento de 0.5% ===");
        banco.aplicarRendimentoPoupanca(0.5);

        // Imprimir extratos após rendimento
        System.out.println("\n=== Extratos Após Rendimento ===");
        poupancaVenilton.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
    }
}