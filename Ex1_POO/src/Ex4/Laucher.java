package Ex4;

public class Laucher {
	public static void main(String[] args) 
	{
		Serie s1=new Serie();
		Serie s2=new Serie("Juego de la Oca","Jose Marin");
		Serie s3=new Serie("El Jogo, la secuela",4,"Terror","Miguel Boss");
		System.out.println("Hoy presentamos "+s1.getTitulo()+" que tiene "+s1.getNumTempo()+" temporadas y es del genero de "+s1.getGenero()+" creada por "+s1.getCreador()+ "  "+s1.isEntregado());
		System.out.println("Hoy presentamos "+s2.getTitulo()+" que tiene "+s2.getNumTempo()+" temporadas y es del genero de "+s2.getGenero()+" creada por "+s2.getCreador()+ "  "+s2.isEntregado());
		System.out.println("Hoy presentamos "+s3.getTitulo()+" que tiene "+s3.getNumTempo()+" temporadas y es del genero de "+s3.getGenero()+" creada por "+s3.getCreador()+ "  "+s3.isEntregado());
				
	}

}
