import java.util.Random;

public class adivina {

	public static void main(String[] args) {
		Random  random= new Random();
		int numaleatorio= random.nextInt(1000)+1;
		
		System.out.println("Numero aleatorio " + numaleatorio);
	}

}
