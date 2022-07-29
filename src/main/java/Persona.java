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

		// RECORRO EL ARRAY AL REVES
		for (int i = 0; i < palabraArray.length; i++) {
			palabraArrayAlReves[i] = palabraArray[palabraArray.length - 1 - i];
		}

		if (Arrays.toString(palabraArray).equalsIgnoreCase(Arrays.toString(palabraArrayAlReves))) {
			return true;
		} else {
			return false;
		}

	}
	
	// BUBBLE SORT EXAMPLE
	public int[] retornarArrayOrdenado(int[] array) {

		// HAY QUE UTILIZAR 2 FOR ANIDADOS PARA ASEGURARSE DE APLICAR LA MISMA LOGICA VARIAS VECES
		for(int i = 0 ; i < array.length -1; i++) {
			
			// RECORRO EL ARRAY /EL MENOS 1 ES PARA EVITAR UN DESBORDAMIENTO YA QUE ABAJO PREGUNTO POR LA POSICION i+1
			for (int j = 0; j < array.length - 1; j++) {

				// CONDICIONAL PARA VALIDAR LA PRIMERA POSICION CON LA SEGUNDA Y ASI SUCESIVAMENTE
				if (array[j] > array[j + 1]) {

					// GUARDO LA PRIMERA POSICION EN UNA VARIABLE AUXILIAR
					int auxiliar = array[j];

					// GUARDO EN LA PRIMERA POSICION EL NUMERO MAS PEQUEÑO
					array[j] = array[j + 1];

					// GUARDO EN LA SEGUNDA POSICION EL NUMERO MAS GRANDE
					array[j + 1] = auxiliar;
				}
			}
		}

		return array;
	}

}
