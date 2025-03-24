package ejercicio1;

public class SudokuValidator {

    private int[][] sudoku;

    public SudokuValidator(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    //Comprueba que todas las filas, columnas y subcuadrículas son correctas
    //Muestra por pantalla el primer error que encuentra:
    //  Si falla una fila muestra: "Falla fila f", siendo f el nº de la fila comenzando en el valor 1
    //  Si falla una columna muestra: "Falla columna c", siendo c el nº de la columna comenzando en el valor 1
    //  Si falla una subcuadrícula 3x3 muestra: "Falla cuadrícula [f][c]", siendo f y c los números de la fila y la columna donde comienza la subcuadrícula comenzando en el valor 1
    public void validar() {
        int orden = 1;
            switch (orden){
                case 1:
                    for(int fil = 0; fil < 9; fil++){
                        if(!validarFila(fil)){
                            System.out.println("Fallo fila " + fil);
                            break;
                        }
                    }
                case 2:
                    for(int col = 0; col < 9; col++){
                        if(!validarColumna(col)){
                            System.out.println("Fallo columna " + col);
                            break;
                        }
                    }
                /*case 3:
                    for(int sci = 0; sci < 9; sci++){
                        for(int scj = 0; scj < 9; scj++){
                            if(!validarSubcuadricula(sci, scj)){
                                System.out.println("Fallo cuadro [" + sci + "][" + scj + "]");
                                break;
                            }
                        }
                    }*/
                case 4:
                    System.out.println("CORRECTO");


        }





    }

    //Comprueba que la fila f contiene los numeros del 1 al 9 sin repetirse
    private boolean validarFila(int f) {
        int[] filaAValidar = sudoku[f]; // Fila a Validar
        for (int i = 0; i < filaAValidar.length; i++){
            int contador = 0; //cada numero empieza repetido 0 veces
            for (int j = 0; j < filaAValidar.length; j++){
                if (filaAValidar[i] == filaAValidar[j]){ // si al recorrerse una segunda vez la fila se encuentra con un numero igual
                    contador++; //añade 1 al contador
                }
            }
            if (contador > 1){ //si el número se repite más de una vez devuelve falso
                return false;
            }
            if(filaAValidar[i] > 9 || filaAValidar[i] < 0){ // si el numero no está entre 0 y 9
                return false;
            }
        }
        return true;
    }

    //Comprueba que la columna c contiene los numeros del 1 al 9 sin repetirse
    private boolean validarColumna(int c) {
        int[] columnaAValidar = new int[sudoku[0].length];
        for (int i = 0; i < sudoku.length; i++){//recorre filas de SUDOKU
            columnaAValidar[i] = sudoku[i][c]; //rellena un array con la columna
        }

        for (int i = 0; i < columnaAValidar.length; i++){
            int contador = 0; //cada numero empieza repetido 0 veces
            for (int j = 0; j < columnaAValidar.length; j++){
                if (columnaAValidar[i] == columnaAValidar[j]){ // si al recorrerse una segunda vez la columna se encuentra con un numero igual
                    contador++; //añade 1 al contador
                }
            }
            if (contador > 1){ //si el número se repite más de una vez devuelve falso
                return false;
            }
            if(columnaAValidar[i] > 9 || columnaAValidar[i] < 0){ // si el numero no está entre 0 y 9
                return false;
            }
        }
        return true;
    }

    //Comprueba que la subcuadrícula de 3x3 que comeinza en la fila f
    // y columna c contiene los numeros del 1 al 9 sin repetirse
    private boolean validarSubcuadricula(int f, int c) {
        int[] subCuadriculaAValidar = new int[9];
        int pos = 0;
        for(int i = f; i < f+3; i++){//recorre filas de la subcuadricula
            for(int j = c; j < c+3; j++){
                subCuadriculaAValidar[pos] = sudoku[i][j];
                if(pos < 8){
                    pos++;
                }
            }
        }
        //Todo esto para obtener la subcuadrícula

        for (int i = 0; i < subCuadriculaAValidar.length; i++){
            int contador = 0; //cada numero empieza repetido 0 veces
            for (int j = 0; j < subCuadriculaAValidar.length; j++){
                if (subCuadriculaAValidar[i] == subCuadriculaAValidar[j]){ // si al recorrerse una segunda vez el array de los numeros de la subcuadricula se encuentra con un numero igual
                    contador++; //añade 1 al contador
                }
            }
            if (contador > 1){ //si el número se repite más de una vez devuelve falso
                return false;
            }
            if(subCuadriculaAValidar[i] > 9 || subCuadriculaAValidar[i] < 0){ // si el numero no está entre 0 y 9
                return false;
            }
        }
        return true;
    }




}

