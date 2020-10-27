/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.util.Scanner;        
        

/**
 *
 * @author gontijo
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int A, B, C; 
System.out.print("Verificador de Triângulo\n\n");


        System.out.print("Digite o lado A = ");
        A = entrada.nextInt(); 
		
        System.out.print("Digite o lado B = ");
        B = entrada.nextInt(); 
		
		System.out.print("Digite o lado C = ");
        C = entrada.nextInt(); 


	if( A < B + C && B < A + C && C < A + B ){ 
	if(A==B && B == C){ 
	System.out.println("É um triângulo Eqüilátero.");
	}
        else if(A==B || A==C || B==C){ 
	System.out.println("É um triângulo Isósceles.");
	}
        else{ 
	System.out.println("É um triângulo Escaleno.");
	}
        }else{ 
	System.out.println("Os lados não formam um triângulo");
	}

    }

}
