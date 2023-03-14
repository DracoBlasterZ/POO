
public class PersonaLaucher {

	public static void main(String[]args)
	{
		Persona p1=new Persona();
		Persona p2=new Persona("Pepe",32,'H');
		Persona p3=new Persona("Madre",25,"34405761H",'M',54.6,1.56);
		System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getDNI()+" "+p1.getSex()+" "+p1.getWeight()+" "+p1.getHeight());
		System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getDNI()+" "+p2.getSex()+" "+p2.getWeight()+" "+p2.getHeight());
		System.out.println(p3.getName()+" "+p3.getAge()+" "+p3.getDNI()+" "+p3.getSex()+" "+p3.getWeight()+" "+p3.getHeight());
	}


}
