
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void aplicarRendimento(double taxa) {
    double rendimento = this.saldo * (taxa / 100);
    this.depositar(rendimento);
	}
}
