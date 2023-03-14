package Ex3;

public class Electrodomestico {
	private double precioBase;
	private String color="Blanco";
	private char consumoEnerg='f';
	private double peso;
	
	public Electrodomestico()
	{
		this.setPrecioBase(100);
		this.setColor("Blanco");
		this.setConsumoEnerg('f');
		this.setPeso(5);
	}
	public Electrodomestico(double preice, double weight)
	{
		this.setPrecioBase(preice);
		this.setPeso(weight);
	}
	public Electrodomestico(double preice,String colorB,char typeEle, double weight)
	{
		this.setPrecioBase(preice);
		this.setColor(checkColor(colorB));
		this.setConsumoEnerg(checkType(typeEle));
		this.setPeso(weight);
	}
	
	public static String checkColor(String cheColor)
	{
		String cheker=cheColor.toLowerCase();
		switch(cheker)
		{
		case "blanco":
			break;
		case "negro":
			break;
		case "rojo":
			break;
		case "azul":
			break;
		case "gris":
			break;
			default:
				cheker="Blanco";
				break;			
		}
		return cheker;
		
	}
	public static char checkType(char cheType)
	{
		char cheker=cheType;
		switch(cheker)
		{
		case 'a':
			break;
		case 'b':
			break;
		case 'c':
			break;
		case 'd':
			break;
		case 'e':
			break;
		case 'f':
			break;
			default:
				cheker='f';
				break;			
		}
		return cheker;
		
		
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnerg() {
		return consumoEnerg;
	}
	public void setConsumoEnerg(char consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
