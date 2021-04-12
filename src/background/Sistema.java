package background;

public class Sistema {

	private int numeroDeConta;
	private String nomeDoUsuario;
	private double Deposito;
	private double EntradaDinheiro;
	private double saidaDeDinheiro;
	private double taxa = 5;
	

	public Sistema(int numeroDeConta, String nomeDoUsuario) {
		this.numeroDeConta = numeroDeConta;
		this.nomeDoUsuario = nomeDoUsuario;
		
	}

	public Sistema(double deposito) {
		this.Deposito = deposito;
	}
	
	

	public int getNumeroDeConta() {
		return numeroDeConta;
	}


	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}


	public double getDeposito() {
		return Deposito;
	}


	public void setDeposito(double deposito) {
		Deposito = deposito;
	}
	
	
	public double getEntradaDinheiro() {
		return EntradaDinheiro;
	}

	public void setEntradaDinheiro(double entradaDinheiro) {
		EntradaDinheiro = entradaDinheiro;
	}

	public double getSaidaDeDinheiro() {
		return saidaDeDinheiro;
	}

	public void setSaidaDeDinheiro(double saidaDeDinheiro) {
		this.saidaDeDinheiro = saidaDeDinheiro;
	}
	


	public double AumentoDeposito(){
		return getDeposito() + getEntradaDinheiro();
	}
	
	public double menosDinheiro() {
		return ( getDeposito() - getSaidaDeDinheiro() ) - taxa;
	}

}
