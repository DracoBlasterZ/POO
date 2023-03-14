package Ex2;

public class Password {
	private int longitud;
	private int contraseña;
	
	public Password()
	{
		this.setLongitud(8);
		this.setContraseña(0);
	}
	public Password(int longi)
	{
		this.setLongitud(longi);
		this.setContraseña(setRandomContra(longi));
	}
	public static int setRandomContra(int lengaht)
	{
		int len=0;
		int protoContra=1;
		while(len<lengaht)
		{
			protoContra=(int)(Math.random()*90000+protoContra);
			len=String.valueOf(protoContra).length();
		}
		return protoContra;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getContraseña() {
		return contraseña;
	}
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

}
