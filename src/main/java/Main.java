import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
	
		try {
			
			//PRIMER EJERCICIO
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
			Persona persona = new Persona(edad, nombre);
			System.out.println(persona.toString());
			
			
			//SEGUNDO EJERCICIO
			String palabra = JOptionPane.showInputDialog("Introduce una palabra , para verificar si es un palindromo");
			if(persona.verificarPalindromo(palabra)) {
				System.out.println("La palabra: '" + palabra + "'" + " si es un palindromo");
			} else {
				System.out.println("La palabra: '" + palabra + "'" + " no es un palindromo");
			}
			
			//TERCER EJERCICIO
			int[] arrayDesordenado = new int[6];
			arrayDesordenado[0] = 40;
			arrayDesordenado[1] = 9;
			arrayDesordenado[2] = 55;
			arrayDesordenado[3] = 1;
			arrayDesordenado[4] = 76;
			arrayDesordenado[5] = 101;

			int[] arrayOrdenado = persona.retornarArrayOrdenado(arrayDesordenado);

			for (int i = 0; i < arrayOrdenado.length; i++) {
				System.out.println(arrayOrdenado[i]);
			}
			
		} catch (Exception e) {
			
			// IMPRIMO LA TRAZA DEL ERROR
			e.printStackTrace();
			
			// LANZO UN EXCEPCION PARA DETENER LA EJECUCION
			throw new Exception(e);
			
		}
		


	}

}
