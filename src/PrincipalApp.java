
public class PrincipalApp {

	public static void main(String[] args) {
		int [] array = {45,55, 66, 17, 18, 23, 5, 7, 75,87};
        EdadApp realizarsuma = new EdadApp(array);
        String resultado = realizarsuma.realizarSuma();
        System.out.println(resultado);
        
	}

}
