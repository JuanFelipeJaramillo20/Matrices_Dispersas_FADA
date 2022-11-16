import java.util.LinkedList;

public class MatricesDispersasCSR{

    private int[][] matrizTest;

    public MatricesDispersasCSR() {
        this.matrizTest = new int[][] {
            {0, 2, 0, 0, 0, 0, 4}, 
            {0, 8, 9, 0, 0, 1, 0}, 
            {0, 0, 0, 3, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0}, 
            {5, 0, 0, 0, 0, 6, 0}, 
            {1, 2, 0, 0, 0, 0, 0}, 
            {4, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 7, 0, 0, 11, 0}
        };
    }

    // CORRECTO
    public void formatoCSR(int[][] matrizDispersa){
        LinkedList<Integer> valores = new LinkedList<Integer>();
        LinkedList<Integer> cfilas = new LinkedList<Integer>();
        LinkedList<Integer> columnas = new LinkedList<Integer>();

        for(int i = 0 ; i < matrizDispersa.length ; i++){
            for(int j = 0 ; j < matrizDispersa[i].length ; j++){
                if(matrizDispersa[i][j] != 0){
                    valores.add(matrizDispersa[i][j]);
                    cfilas.add(i);
                    columnas.add(i);
                }
            }
        }
        System.out.println(valores.toString());
        System.out.println(cfilas.toString());
        System.out.println(columnas.toString());
    }

    public void crearRepresentacion(int[][] matrizDispersa){

    }

    public int[][] obtenerMatriz(){
        return null;
    }

    public int obtenerElemento(int i, int j){
        return 1;
    }

    public int[] obtenerFila(int i){
        return null;
    }

    public int[] obtenerColumna(int j){
        return null;
    }

    public void modificarPosicion(int[][] matrizDispersa, int i, int j){

    }

    public void elevarAlCuadrado(int[][] matrizDispersa){

    }

    public void matrizTranspuesta(int[][] matrizDispersa){

    }
    
    public static void main(String[] args) {
        MatricesDispersasCSR test = new MatricesDispersasCSR();
    }
}