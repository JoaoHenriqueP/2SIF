import java.util.Scanner;
public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int nmr[] = new int [5] ;
		int maior = 0;
		int menor = 0;
		nmr[0] = 5;
		nmr[1] = 7;
		nmr[2] = 12;
		nmr[3] = 1;
		nmr[4] = 3;
		System.out.println("oi");
		for (int cont=0;cont<nmr.length;cont++) {
			if (nmr[cont]>maior) {
				maior=nmr[cont];
			} if (cont == 0) {
				menor=nmr[cont];
			} if (cont != 0 & nmr[cont]<menor) {
				menor=nmr[cont];
			}
		}
		System.out.println(menor);
		System.out.println(maior);
		
	}

}
