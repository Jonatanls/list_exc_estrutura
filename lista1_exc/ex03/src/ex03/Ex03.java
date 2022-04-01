/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;
 
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int qntAlunos;
                
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de Alunos: ");
        qntAlunos = scanner.nextInt();
                
        double []notas = new double[qntAlunos] ;
        for(int i = 0 ; i < qntAlunos; i++ ){
            System.out.println("Informe a média do " + (i+1) + "° aluno: ");
            notas[i] = scanner.nextInt();
        }
        
        double aux = 0;
        
        for(int i = 1; i< notas.length; i++){
            for(int j = 0; j < notas.length -1; j++){
                if (notas[j] < notas[j+1]){
                    aux = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux;                    
                }
            }
        }
        
        System.out.println(Arrays.toString(notas));
        System.out.println("A maior nota foi: " + notas[0] + " e a menor nota foi: " + notas[qntAlunos - 1]);   
    }
    
}
