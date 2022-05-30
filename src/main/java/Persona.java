import java.util.Arrays;

public class Persona {

	public int edad;
	public String nombre;

	public Persona() {

	}

	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}

	public boolean verificarPalindromo(String palabra) {

		// CREO UN ARRAY DEL LARGO DE LA PALABRA INGRESADA
		String[] palabraArray = new String[palabra.length()];

		// OBTENGO UN ARRAY CON LAS LETRAS DE LA PALABRA EN CADA POSICION
		palabraArray = palabra.split("");

		// CREO UN NUEVO ARRAY PARA GUARDAR LA PALABRA INGRESADA AL REVES
		String[] palabraArrayAlReves = new String[palabra.length()];

		//RECORRO EL ARRAY AL REVES
		for (int i = 0; i < palabraArray.length; i++) {
			palabraArrayAlReves[i] = palabraArray[palabraArray.length - 1 - i];
		}

		if (Arrays.toString(palabraArray).equalsIgnoreCase(Arrays.toString(palabraArrayAlReves))) {
			return true;
		} else {
			return false;
		}

	}

	public int[] retornarArrayOrdenado(int[] array) {

		// ESTE ES ORDENAMIENTO BURBUJA , SOLO QUE INTERNET EN VEZ DE WHILE OCUPAN OTRO
		// FOR - SOLO PARA ASEGURARSE DE QUE SE ITERE VARIAS VECES YA QUE CON UN SOLO
		// RECORRIDO NO SE ORDENA UN ARRAY MUY GRANDE
		int j = 0;
		while (j < array.length) {
			
			// RECORRO EL ARRAY /EL MENOS 1 ES PARA EVITAR UN DESBORDAMIENTO YA QUE ABAJO PREGUNTO POR LA POSICION i+1 
			for (int i = 0; i < array.length - 1; i++) {

				// VALIDACION PARA NO ESCAPARME DEL ARREGLO
				// if (i != array.length - 1) {

				// CONDICIONAL PARA VALIDAR LA PRIMERA POSICION CON LA SEGUNDA Y ASI
				// SUCESIVAMENTE
				if (array[i] > array[i + 1]) {

					// GUARDO LA PRIMERA POSICION EN UNA VARIABLE AUXILIAR
					int auxiliar = array[i];

					// GUARDO EN LA PRIMERA POSICION EL NUMERO MAS PEQUEÑO
					array[i] = array[i + 1];

					// GUARDO EN LA SEGUNDA POSICION EL NUMERO MAS GRANDE
					array[i + 1] = auxiliar;
				}
				// }
			}
			j++;
		}

		return array;
	}

}
