package maven.demo;

public class Principal {
	
	public static void main(String[] args)
	{
		DAO dao = new DAO();
		dao.conectar();
		
		//Inserir 
		Aluno aluno = new Aluno(01, "Joao", "Rua Brasil, 130");
		
		if(dao.inserirAluno(aluno) == true)
		{
			System.out.println("Insercao com sucesso - " + aluno.toString());
		}
		
		//Atualizar
		aluno.setNome("novo aluno");
		dao.atualizarAluno(aluno);
		
		//Excluir
		dao.excluirAluno(aluno.getMatricula());
		
		//Exibir
		Aluno[] alunos = dao.getAluno();
		System.out.println("Exibir Alunos");
		
		for(int i = 0; i < alunos.length; i++)
		{
			System.out.println(alunos[i].toString());
		}
		
	}
}