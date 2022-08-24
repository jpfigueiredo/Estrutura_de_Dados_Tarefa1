package Exercicio1_V2;

import java.util.Random;
import java.util.Scanner;

public class vetorv2 {
	
	
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        int[] vetor = new int[10];
        
        
        Random random = new Random();
        
        int num;
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(999);
            System.out.println(vetor[i]);
        }
        
        System.out.println("Insira um número para procurar no vetor:");
        num = scan.nextInt();
        
        for(int i = 0; i < vetor.length; i++){
            
            if(vetor[i] == num){
                System.out.println("O índice do vetor inserido é " + i);
                
            } else if(i == vetor.length-1){
            	
                System.out.println("Número não encontrado no vetor");
                scan.close();
            }
        }}
	
	
}
