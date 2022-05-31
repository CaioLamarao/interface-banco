package entities;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static Integer SEQUENCIAL = 1;
	
	protected Integer agencia;
	protected Integer numero;
	protected double saldo;
	protected Cliente cliente;
	
	

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override	
	public void saque(double montante) {
		if(montante > saldo) {
			System.out.println("Você não possui saldo suficiente");
		} else {
			saldo -= montante;
			
		}
	}
	
	@Override
	public void deposito(double montante) {
		saldo += montante;
	}
	
	@Override
	public void transferencia(double montante, Conta contaDestino) {
		if(montante > saldo) {
			System.out.println("Você não possui saldo para realizar esta transferência");
		} else {
			this.saque(montante);
			contaDestino.deposito(montante);
			
		}
	}
	
	protected void dadosComuns() {
		System.out.println();
		System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência Bancária: %d", this.agencia));
		System.out.println(String.format("Número da Conta: %d", this.numero));
		System.out.println(String.format("Saldo da Conta: %.2f", this.saldo));
		System.out.println();
	}
}
