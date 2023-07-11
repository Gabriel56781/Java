package entities;

public class pessoa {

	private int num_conta;
	private String nome;
	private double balance;

	
	public pessoa() {
		
		
	}
	public pessoa(int num_conta, String nome, double deposito) {
		super();
		this.num_conta = num_conta;
		this.nome = nome;
		setdeposito(deposito) ;
	}

	public pessoa(int num_conta, String nome) {
		super();
		this.num_conta = num_conta;
		this.nome = nome;
		;
	}

	public int getNum_conta() {
		return num_conta;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getbalance() {
		return balance ;
	}

	

	public void setdeposito(double deposito) {
		
		 this.balance=+deposito;		
			
	}
	
	public void withdraw(double deposito) {
		
		this.balance = this.balance -deposito - 5;
		
	}
	public void res0(double deposito) {
		
		this.balance= this.balance-deposito;
	}
}
