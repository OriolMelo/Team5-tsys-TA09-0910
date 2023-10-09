package Raices;
import java.util.Scanner;

public class RaicesApp {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribir el valor de a");
	    Double a = scanner.nextDouble(); 
	    System.out.println(a);
	    
	    System.out.println("Escribir el valor de b");
	    Double b = scanner.nextDouble(); 
	    System.out.println(b);
	    
	    System.out.println("Escribir el valor de c");
	    Double c = scanner.nextDouble(); 
	    System.out.println(c);
	    
	    Raices raices = new Raices( a, b, c);
	    
	    System.out.println(" --- El resultado és ---");

	    raices.calcular();	
	    
	    scanner.close();
  
		
	    
	}
}
