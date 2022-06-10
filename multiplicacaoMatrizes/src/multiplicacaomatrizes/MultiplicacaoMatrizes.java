/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacaomatrizes;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class MultiplicacaoMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in); //criar o Scanner apenas uma vez

int ma[][] = new int[2][5];
int mb[][] = new int[5][2];
int mab[][] = new int[2][2];

for (int i = 0; i < ma.length; i++) {
    for (int j = 0; j < ma[i].length; j++) {
        System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " da matriz 1");
        ma[i][j] = teclado.nextInt(); //ler com base no Scanner criado
    }
}

for (int i = 0; i < mb.length; i++) {
    for (int j = 0; j < mb[i].length; j++) {
        System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " da matriz 2");
        mb[i][j] = teclado.nextInt(); //ler com base no Scanner criado
    }
}

//calculo da multiplicação das matrizes
for(int i=0; i<mab.length; i++){
    for(int j=0; j<mab[i].length; j++){
        for(int k=0; k<ma[i].length; k++){
            mab[i][j] += ma[i][k] * mb[k][j];
        }
        System.out.println(mab[i][j]);
    }
}
        
    }
    
}
