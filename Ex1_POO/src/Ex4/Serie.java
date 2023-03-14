package Ex4;

public class Serie {
	private String titulo;
	private int numTempo=3;
	private boolean entregado=false;
	private String genero;
	private String creador;
	
	public Serie()
	{
		this.setTitulo(null);
		this.setGenero(null);
		this.setCreador(null);
	}
	public Serie(String title, String creator)
	{
		this.setTitulo(title);
		this.setCreador(creator);
	}
	public Serie(String title,int tempor,String genere, String creator)
	{
		this.setTitulo(title);
		this.setNumTempo(tempor);
		this.setGenero(genere);
		this.setCreador(creator);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTempo() {
		return numTempo;
	}
	public void setNumTempo(int numTempo) {
		this.numTempo = numTempo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	
	
}
