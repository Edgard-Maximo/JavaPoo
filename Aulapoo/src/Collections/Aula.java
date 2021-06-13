package Collections;

public class Aula {
	
	private String titulo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	private int tempo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	
	public String toString() {
		return "[AUla: " + this.titulo + " , " + this.tempo + "minutos]";
		
	}
	
	
	

}
