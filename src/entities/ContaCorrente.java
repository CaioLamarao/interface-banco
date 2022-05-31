package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void meuExtrato() {
		System.out.println("===== Dados da Conta Corrente ====");
		super.dadosComuns();
	
	}

	
	
	
}
