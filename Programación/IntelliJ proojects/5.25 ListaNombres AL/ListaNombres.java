
/**
 * La clase mantiene una lista de nombres
 * en orden l�xicogr�fico  
 * 
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
 

public class ListaNombres
{
        private String[]  lista;
        private int pos;

        /**
         * Constructor de la clase ListaNombres
         * n es el tama�o m�ximo de la lista
         */
        public ListaNombres(int n) 
        {              
              lista = new String[n];
              pos = 0;
        }

        /**
         * @return  true si la lista est� vac�a   
         */
        public boolean  listaVacia()
        {
            return pos == 0;
        }
        
        /**
         * 
         * @return  true si la lista est� llena   
         */
        public boolean  listaLlena()
        {
            for (int i = 0; i < lista.length; i++){
                pos = 0;
                if(lista[i] != null){
                    pos++;
                }
            }
            return pos >= lista.length;
        }
        
        /**
         * Inserta un nombre en la lista �nicamente
         * si no est� y la lista no est� llena. La inserci�n se hace de tal
         * manera que el nombre queda colocado en el 
         * lugar que le corresponde manteniendo el orden 
         * de la lista (no se utiliza ning�n algoritmo de ordenaci�n)
         * Importan may�sculas y min�sculas 
         * 
         * @param nombre el nombre a insertar
         * @return  true si la inserci�n se hace con �xito   
         *
         */
        public boolean insertarNombre(String nombre)
        {
              for (int i = 0; i < lista.length; i++){
                      if (!estaNombre(nombre) && !listaLlena()){
                      lista[i] = nombre;
                      return true;
                  }
              }
            return false;
        }
        
        /**
         *  Busca un nombre en la lista
         *  Puesto que la lista est� en todo momento ordenada
         *  se hace una b�squeda binaria
         *  @param  nombre el nombre a buscar
         *  @return   true si ya existe el nombre en la lista  
         *   
         */
        private boolean estaNombre(String nombre)
        {
            for (int i = 0; i< lista.length; i++){
                if (lista[i] != null && nombre.equals(lista[i])  ){
                    return true;
                }
            }

            return false;
        }
        
        /**
         *  Busca y devuelve el nombre de mayor longitud
         *  en la lista. Si hay varios devuelve el
         *  primero encontrado
         *  Si la lista est� vac�a devuelve null
         *  
         *  @return   el nombre m�s largo  
         *  
         */
        public String nombreMasLargo()
        {
            int caracteres = 0;
            String maslargo = "";
               for(int i = 0; i < lista.length; i++) {
                   if (lista[i] != null && lista[i].length() > caracteres){
                       caracteres = lista[i].length();
                       maslargo = lista[i];
                   }

               }
            return maslargo;
        }
        
        /**
         * Borra de la lista los nombres que empiezan por 
         * una letra determinada (s� importan may�sculas y min�sculas)
         * No es lo mismo borrarLetra('A') que borrarLetra('a')
         *
         * @param letra la letra por la que han de empezar los nombres 
         *    
         */
        public void borrarLetra(char letra)
        {
                for (int i = 0; i < lista.length; i++){
                    if(lista[i] != null && lista[i].charAt(0) == letra){
                        lista[i] = null;
                    }
                }
            
            
        }
        
        /**
         * Borra un nombre de la posici�n indicada
         * 
         *
         * @param  p posici�n del nombre a borrar
         *  
         */
        private void borrarDePosicion(int p)
        {
               lista[p] = null;
        }
         
       
        
        /**
         * Cuenta cu�ntos nombres empiezan por una determinada 
         * cadena sin importar   may�sculas o min�sculas
         *
         * @param  inicio cadena de comienzo
         * @return  la cantidad de nombres calculados   
         */
        public int empiezanPor(String inicio)
        {
               int cuenta = 0;
               for (int i = 0; i < lista.length; i++){
                   if (lista[i] != null && lista[i].startsWith(inicio)){
                       cuenta++;
                   }
               }
                return cuenta;
        }
        
         /** 
         * 
         * Devuelve un array con los  nombres que empiezan por una determinada 
         * letra sin importar si es may�scula o min�scula
         * 
         * @param  letra letra de comienzo
         * @return  la cantidad de nombres encontrados
         *          con esa letra   
         */ 
        public String[] empiezanPorLetra(char letra)
        {
                int cuenta = 0;
                for(int i = 0; i < lista.length; i++){
                    if(lista[i] != null && (lista[i].toLowerCase().charAt(0) == letra || lista[i].toUpperCase().charAt(0) == letra)){
                        cuenta ++;
                    }
                }
                String[] nuevo = new String[cuenta];
                int posnuevo = 0;
                for (int i = 0; i < lista.length; i++){
                    if(lista[i] != null && (lista[i].toLowerCase().charAt(0) == letra || lista[i].toUpperCase().charAt(0) == letra)){
                        nuevo[posnuevo] = lista[i];
                    }
                }
                return nuevo;
        }
        
       /**
         * Representaci�n textual de la cadena
         * 
         * @return la cadena resultante    
         */
        public String toString()
        {
           return Arrays.toString(lista);
        }
        
          /**
         *  Mostrar la lista en pantalla 
         */
        public void printLista()
        {
                System.out.println(this.toString());
        }
        
          /**
         * Lee de un fichero de texto una serie 
         * de nombres con ayuda de un objeto de la 
         * clase Scanner y los almacena en la lista
         */
        public void cargarDeFichero() 
        {
			Scanner sc = null;
            try    {
                     sc = new Scanner(new File("nombres.txt"));
                     while (sc.hasNextLine() && !listaLlena()) {
						  insertarNombre(sc.nextLine());
					 }                          
                     
             }
             catch (IOException e)      {
                     e.printStackTrace();
             }
			 finally {
				 sc.close();
			 }
			 
        }

        public String[] invertir(){

            String [] invertido = new String[lista.length];
            invertido = Arrays.copyOf(lista, lista.length);
            for (int i = 0; i < (invertido.length - 1)/2; i++){
                String temp = invertido[i];
                invertido[i] = invertido[invertido.length - 1 - i];
                invertido[invertido.length - 1 -i] = temp;
            }
            return invertido;
        }

        public static String invertir(String nombre){
            return new StringBuilder(nombre).reverse().toString();
        }
        
}
