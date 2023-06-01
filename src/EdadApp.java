
public class EdadApp {

	private int[] array;

    public EdadApp(int[] array) {
        this.array = array;
    }
   
    public String realizarSuma() {
    	int mayor = 0;
    	int menor = 0;
    	int jubilado = 0;
    	int i ;
     for (i=0 ; i<array.length; i++) {
    	 if (array[i]<18){
    		menor = menor+1; 
    	 }
    	 if (array[i]>=18) {
    		 mayor = mayor+1;
    	 }
    	 if (array[i]>=65) {
    		 jubilado = jubilado+1;
    	 }
     }
    String cadena= "***Menores de edad:" + menor+ " ***Mayores de edad:" +mayor+" ***Jubilados :" +jubilado+"***";
    	return cadena;
    	
    }
      
}
