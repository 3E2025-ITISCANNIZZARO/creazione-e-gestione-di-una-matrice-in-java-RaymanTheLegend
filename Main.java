//Esercizio: Lavorare con le Matrici in Java
//
//1. Creare una matrice 3x3 di numeri interi.
//2. Popolare la matrice con valori casuali compresi tra 1 e 100.
//3. Implementare un metodo che calcoli la somma di tutti gli elementi della matrice.
//4. Implementare un metodo che trovi il valore massimo nella matrice.
//5. Stampare la matrice, la somma degli elementi e il valore massimo trovato.
//
//Suggerimento:
//- Utilizza la classe Random per generare numeri casuali.
//- Per stampare la matrice, usa un ciclo annidato.
import java.util.*;

public class Main {
 public static void main(String[] args) {
     // Creazione e popolamento della matrice
     int[][] matrix = new int[3][3];
     Random random = new Random();
     //INSERISCI IL CODICE
     for(int cont = 0; cont < matrix.length; cont++) {
    	 for(int c = 0; c < matrix.length; c++) {
    		 matrix[cont][c] =(int) (Math.random() * 100 + 1);
    	 }
     }   

     // Stampa della matrice
     System.out.println("Matrice:");
     // COMPLETARE IL CODICE
     System.out.println(Arrays.toString(matrix[0])+"\n"
     		           +Arrays.toString(matrix[1])+"\n"
     		           +Arrays.toString(matrix[2]));


     // Calcolo della somma degli elementi
     int sum = calculateSum(matrix);
     System.out.println("Somma degli elementi: " + sum);

     // Ricerca del valore massimo
     int max = findMax(matrix);
     System.out.println("Valore massimo: " + max);

     // Conteggio dei valori pari
     int pari = findPari(matrix);
     System.out.println("Numeri pari: " + pari);

     // Conteggio dei valori dispari
     int dispari = findDispari(matrix);
     System.out.println("Numeri dispari: " + dispari);
 }

 public static int calculateSum(int[][] matrix) {
     int sum = 0;

//COMPLETARE IL CODICE
     for(int cont = 0; cont < matrix.length; cont++) {
    	 for(int c = 0; c < matrix.length; c++) {
    		 sum += matrix[c][cont];
    	 }
     }
     return sum;
 }

 public static int findMax(int[][] matrix) {
     int max = matrix[0][0];
     int maxPx = 0;
     int maxPy = 0;

//COMPLETARE IL CODICE
     for(int cont = 0; cont < matrix.length; cont++) {
    	 for(int c = 0; c < matrix.length; c++) {
       if(max <= matrix[c][cont]){
        maxPx = cont + 1;
        maxPy = c + 1;
       }
       max = Math.max(max, matrix[c][cont]);
    	 }
     }
     System.out.println("Posizione Valore massimo = "+maxPx+", "+maxPy);
     return max;
 }
 public static int findPari(int[][] matrix) {
  int pari = 0;
  for(int cont = 0; cont < matrix.length; cont++) {
   for(int c = 0; c < matrix.length; c++){
       if(matrix[c][cont] % 2 == 0){
        pari++;
       }
   }
  }
  return pari;
  }
 public static int findDispari(int[][] matrix) {
  int dispari = 0;
  for(int cont = 0; cont < matrix.length; cont++) {
   for(int c = 0; c < matrix.length; c++){
       if(matrix[c][cont] % 2 != 0){
        dispari++;
       }
   }
  }
  return dispari;
  }
}
