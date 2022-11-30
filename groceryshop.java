package patika;
import java.util.Scanner;
public class groceryshop {

	public static void main(String[] args) {
		
		//apple
		System.out.print("How much kilos Apple : ");
		Scanner input = new Scanner(System.in);
		Double Apple;
		Apple = input.nextDouble();
		Double a = Apple * 2.14  ;
		
		//Lemon
		System.out.print("How much kilos Lemon : ");
		Scanner secondput = new Scanner(System.in);
		Double Lemon;
		Lemon = secondput.nextDouble();
		Double b = Lemon * 1.60  ;
		
		
		//Pear
		System.out.print("How much kilos Pear : ");
		Scanner thirdput = new Scanner(System.in);
		Double Pear;
		Pear = thirdput.nextDouble();
		Double c = Pear * 3.45 ;
		
	   
		//Plum
		System.out.print("How much kilos Plum : ");
		Scanner fourthput = new Scanner(System.in);
		Double Plum;
		Plum = fourthput.nextDouble();
		Double d = Plum * 4 ;
		
		//Total
		double total = a + b + c + d ;
		System.out.println("TOTAL : "+ total + " $");
		
		
	}

}
