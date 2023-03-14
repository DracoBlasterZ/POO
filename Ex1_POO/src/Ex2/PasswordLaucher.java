package Ex2;

public class PasswordLaucher {
	 public static void main(String[]args)
	 {
		 Password pas1=new Password();
		 Password pas2=new Password(5);
		 System.out.println(pas1.getLongitud()+" "+pas1.getContraseña());
		 System.out.println(pas2.getLongitud()+" "+pas2.getContraseña());
		 
	 }


}
