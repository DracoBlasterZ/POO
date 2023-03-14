
public class Persona {
	private String name;
	private int age;
	private String DNI="00000000J";
	private char sex= 'H';
	private double weight;
	private double height;
	
	public Persona() {
		this.setName(null);
		this.setAge(0);
		this.setWeight(0);
		this.setHeight(0);
	}
	public Persona(String namePer,int agePer,char sexPer)
	{
		this.setName(namePer);
		this.setAge(agePer);
		this.setSex(sexPer);
	}
	public Persona(String namePer,int agePer,String DNIPer,char sexPer, double weiH,double heiPer)
	{
		this.setName(namePer);
		this.setDNI(checkDNI(DNIPer));
		this.setAge(agePer);
		this.setSex(sexPer);
		this.setWeight(weiH);
		this.setHeight(heiPer);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public static String checkDNI(String DNIyes)
	{
		if(DNIyes==null)
		{
			return "00000000A";
		}
		return DNIyes;
	}
	
	
}

