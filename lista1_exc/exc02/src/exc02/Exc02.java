/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exc02 {

 public static void main(String[] args) {
        int tam;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Qual o tamanho do vetor; ");
        tam = ent.nextInt();
        
        int[] x;
        x = preencheVetor(tam);
        
        
         x = bubble_sort_desc(x);
        
        System.out.println("Vetor desc: " + imprimeVetor(x));
        
    }
   
    
    
    public static int[] preencheVetor(int tam){
        int[] x = new int[tam] ;
        Scanner ent;
        ent = new Scanner(System.in);
        for(int c=0; c<tam; c++){
            System.out.print("Informa o " + (c+1) + " numero: ");
            x[c] = ent.nextInt();
        }
        return x;
    }

    public static String imprimeVetor(int[] x){
        String vet = "> ";
        for(int c=0;c<x.length;c++){
            if(c==x.length-1){
                vet = vet + x[c]+".";
            }else{
                vet = vet + x[c]+" - ";    
            }                    
        }        
        return vet;        
    }
    
    public static int[] bubble_sort_desc(int [] x){
        
          int aux =0;
        
        for (int i=1;i < x .length; i++) {
            for(int j=0; j< x.length-1;j++){
                if (x[j] < x [j+1]) {
                aux = x [j];
                x[j] = x [j+1];
                x [j+1] = aux;
                
                }   
                
            }
        }    
    
        
        return x;
    }
    
    
}