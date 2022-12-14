import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.plaf.ColorUIResource;

public class MatricesDispersasCoordenado {

    private int[][] matrizTest;
    private LinkedList<Integer> valores = new LinkedList<Integer>();
    private LinkedList<Integer> filas = new LinkedList<Integer>();
    private LinkedList<Integer> columnas = new LinkedList<Integer>();

    public MatricesDispersasCoordenado() {
        this.matrizTest = new int[][] {
                { 0, 2, 0, 0, 0, 0, 4 },
                { 0, 8, 9, 0, 0, 1, 0 },
                { 0, 0, 0, 3, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 5, 0, 0, 0, 0, 6, 0 },
                { 1, 2, 0, 0, 0, 0, 0 },
                { 4, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 7, 0, 0, 11, 0 }
        };
    }

    // CORRECTO
    public void formatoCoordenado(int[][] matrizDispersa) {

        for (int i = 0; i < matrizDispersa.length; i++) {
            for (int j = 0; j < matrizDispersa[i].length; j++) {
                if (matrizDispersa[i][j] != 0) {
                    this.valores.add(matrizDispersa[i][j]);
                    this.filas.add(i);
                    this.columnas.add(j);
                }
            }
        }
        System.out.println(this.valores.toString());
        System.out.println(this.filas.toString());
        System.out.println(this.columnas.toString());
    }

    public void crearRepresentacion(int[][] matrizDispersa) {

    }

    public int[][] obtenerMatriz() {
        return null;
    }

    public int obtenerElemento(int i, int j) {
        for (int k = 0; i < this.valores.size(); k++) {
            if (this.filas.get(k) == i && this.columnas.get(k) == j) {
                return this.valores.get(k);
            }
        }
        return 0;
    }

    public int[] obtenerFila(int i) {
        int[] fila = new int[this.matrizTest[0].length];
        for (int j = 0; j < fila.length; j++) {
            if (this.filas.get(j) == i) {
                fila[this.columnas.get(j)] = this.valores.get(j);
            }
        }
        return fila;
    }

    public int[] obtenerColumna(int j) {
        int[] columna = new int[this.matrizTest.length];
        for (int i = 0; i < columnas.size(); i++) {
            if (columnas.get(i) == j) {
                columna[filas.get(i)] = valores.get(i);
            }
        }
        return columna;
    }

    public void modificarPosicion(int i, int j, int elemento) {
        boolean modificado = false;
        for (int k = 0; k < filas.size(); k++) {
            if (filas.get(k) == i && columnas.get(k) == j) {
                valores.set(k, elemento);
                modificado = true;
            }
        }
        if (!modificado) {
            valores.add(elemento);
            filas.add(i);
            columnas.add(j);
        }
    }

    public void elevarAlCuadrado(int[][] matrizDispersa) {
        LinkedList<Integer> valoresC = new LinkedList<Integer>();
        LinkedList<Integer> filasC = new LinkedList<Integer>();
        LinkedList<Integer> columnas = new LinkedList<Integer>();

        for (int i = 0; i < this.valores.size(); i++) {

        }
    }

    public void matrizTranspuesta(int[][] matrizDispersa) {

    }

    public static void main(String[] args) {
        MatricesDispersasCoordenado test = new MatricesDispersasCoordenado();
        test.formatoCoordenado(test.matrizTest);
        /*
         * System.out.println(test.obtenerElemento(0, 6));
         * System.out.println(Arrays.toString(test.obtenerFila(0)));
         * System.out.println(Arrays.toString(test.obtenerColumna(0)));
         * System.out.println(test.valores.toString());
         * System.out.println(test.filas.toString());
         * System.out.println(test.columnas.toString());
         * test.modificarPosicion(0, 1, 5);
         * System.out.println(test.valores.toString());
         * System.out.println(test.filas.toString());
         * System.out.println(test.columnas.toString()); test.modificarPosicion(0, 2,
         * 5);
         * System.out.println(test.valores.toString());
         * System.out.println(test.filas.toString());
         * System.out.println(test.columnas.toString());
         */
    }
}