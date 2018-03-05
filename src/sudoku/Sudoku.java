/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author carlosabia
 */
public class Sudoku {
    public boolean chequeaSudoku(int[][] matriz) {
        //Pasar cada numero a string y eliminarlo de un string con todos los numeros.
        boolean resultado = true;
        String numComprobado;
        String comprobar = "123456789";
        if(matriz.length == 3 && matriz[0].length == 3){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    numComprobado = Integer.toString(matriz[i][j]);
                    if (comprobar.contains(numComprobado)) {
                        comprobar = comprobar.replace(numComprobado, "");
                    } else {
                        resultado = false;
                    }
                }
            }
        }else resultado = false;       
        return resultado;
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku chequeaSudoku = new Sudoku();
        System.out.println("===================================================");
        int[][] matriz1 = {
            {1, 2, 2},
            {5, 4, 6},
            {7, 8, 9}
        };
        int[][] matriz2 = {
            {0, 2, 3},
            {5, 4, 6},
            {7, 8, 9}
        };
        int[][] matriz3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matriz4 = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };
        int[][] matriz5 = {
            {01, 02, 3},
            {4, 5*1, 6},
            {07, 8, 9*2}
        };
        int[][] matriz6 = {
            {3%2, 2, 3},
            {4, 5, 6},
            {07, 8, 9}
        };
        int[][] matriz7 = {
            {3%2, 2, 3},
            {4, 5, Math.abs(-6)},
            {07, 8, 9}
        };
        int[][] matriz8 = {
            {11, 22, 33},
            {44, 55, 66},
            {77, 88, 99}
        };
        int[][] matriz9 = {
            {1, 2, (int)Math.pow(3, 1)},
            {4, 5, (int)Math.pow(6, 1)},
            {7, 8, 9}
        };
        int[][] matriz10 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}, 
            {0, 0, 0}
        };
        int[][] matriz11 = {
            {1, 2, 3},
            {4, 5, -6*-1},
            {7, 8, -9*-1}
        };
        int[][] matriz12 = {
            {(int)Math.sqrt(1), 2, (int)Math.sqrt(9)},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz1));
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz2));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz3));
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz4));
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz5));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz6));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz7));
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz8));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz9));
        System.out.println("Debería dar false");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz10));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz11));
        System.out.println("Debería dar true");
        System.out.println(chequeaSudoku.chequeaSudoku(matriz12));
        System.out.println();
    }
    
}
