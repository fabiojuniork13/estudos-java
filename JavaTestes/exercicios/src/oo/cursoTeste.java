package oo;

public class cursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jo?o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Gustavo");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2003");
		Curso curso3 = new Curso("React Native");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome + " | " + aluno.cursos);
		}
	}
	
}
