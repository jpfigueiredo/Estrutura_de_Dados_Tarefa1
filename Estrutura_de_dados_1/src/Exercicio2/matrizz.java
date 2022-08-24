package Exercicio2;

import java.util.Random;

public class matrizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = new int [3][4];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		Random random = new Random();
		
		
		for(int linhas=0;linhas<3;linhas++) {
			for(int cols=0;cols<4;cols++) {
				matriz[linhas][cols]=random.nextInt(100);
				
				System.out.printf("%d\t" ,matriz[linhas][cols]);
	
				if(matriz[linhas][cols] > maior) {
					maior = matriz [linhas][cols];
				}
				
				if(matriz[linhas][cols] < menor) {
					menor = matriz [linhas][cols];
				}
				
				
				System.out.println("");
				
				
				
			}
		}
		
		
		
	
		
		
		
		
	}

}
