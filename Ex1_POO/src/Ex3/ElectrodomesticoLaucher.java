package Ex3;

public class ElectrodomesticoLaucher {
	public static void main(String[] args) 
	{
		Electrodomestico tt1=new  Electrodomestico();
		Electrodomestico tt2=new  Electrodomestico(34, 20.4);
		Electrodomestico tt3=new  Electrodomestico(450.99,"Azul",'a',20.50);
		System.out.println(tt1.getPrecioBase()+" "+tt1.getColor()+" "+tt1.getConsumoEnerg()+" "+tt1.getPeso());
		System.out.println(tt2.getPrecioBase()+" "+tt2.getColor()+" "+tt2.getConsumoEnerg()+" "+tt2.getPeso());
		System.out.println(tt3.getPrecioBase()+" "+tt3.getColor()+" "+tt3.getConsumoEnerg()+" "+tt3.getPeso());
	}

}
