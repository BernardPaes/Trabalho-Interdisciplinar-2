package maven.demo;

public class Aluno {
	private int matricula; 
	private String nome;
	private String endereco;
	
	public Aluno() {
		this.matricula = -1;
		this.nome = "";
		this.endereco = "";
	}
	
	public Aluno(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.endereco = endereco;
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//Sobrescrevendo
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
}
