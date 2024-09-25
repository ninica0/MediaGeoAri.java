import java.util.Scanner;

public class MediaGeoAri {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Declaração de variáveis 
	double a, b , c , r, mg;
	
	//Entrada de dados 

	System.out.println("Digite o primeiro número: ");
	a = sc.nextDouble();
	System.out.println("Digite o segundo número: ");
	b = sc.nextDouble();
	System.out.println("Digite o terceiro número: ");
	c = sc.nextDouble();
//Cálculo de processamento
	
	r = (a+ b + c )/3.0;
	
	mg = Math.pow(a*b*c, 1.0/3.0);
//	Comando de sáida 
	System.out.printf("A média aritmética é: %.2f " , r );
	System.out.println();
	System.out.printf("A média geométrica é: %.2f " , mg);
	sc.close();

	
	}

}
