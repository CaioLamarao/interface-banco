package entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void meuExtrato() {
		System.out.println("===== Dados da Conta Poupança ====");
		super.dadosComuns();
	
	}
	
}
