package entidade;
/**
 *
 * @author Done
 */
public class Cliente {

	private String cpf;
	private String nome;
	private String situacao;
	private double salario;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, String nome, String situacao, double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.situacao = situacao;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", situacao=" + situacao + ", salario="
				+ salario + "]";
	}

}