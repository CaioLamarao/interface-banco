package entities;

public interface IConta {
	
	void saque(double montante);
		
	void deposito(double montante);
	
	void transferencia(double montante, Conta contaDestino);
		
	void meuExtrato();
}
