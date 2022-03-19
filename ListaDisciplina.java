package Disciplina.java;

public class ListaDisciplina {

	private String[] nome;
		private String professor;
		private String semestre;
		private String horario;
		
		//construtor
		public ListaDisciplina(String[] nome, String professor, String semestre, String horario) {
			super();
			this.nome = nome;
			this.professor = professor;
			this.semestre = semestre;
			this.horario = horario;
		}
	
		
		public boolean add(String nome) {
			return true;

		}
	
		public boolean remove(String nome) {
			return true;
		}
		
		public boolean size() {
			return true;
		}
		
	}
	
	
	


