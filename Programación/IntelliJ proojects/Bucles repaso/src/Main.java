public class Main {
    public static void main(String[] args) {       
       Ejercicio2();
    }
    private static void Ejercicio1(int numero){
        for(int i = 1; i <= numero; i++){
            for(int j = 1; j<= i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void Ejercicio2(){
        int numero = (int) (Math.random()*16 + 15);
        for (int i =1; i <= numero; i++){
        	int asterisco = (int)(Math.random()*numero);
            for(int j = 1; j < numero; j++){
            	if(j == asterisco) {
            		System.out.print("*");
            	}else {            	
            	System.out.print("+"); 
            	}
            }System.out.print("\n");
        }
        
    }
}

