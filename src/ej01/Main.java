package ej01;

public class Main {

	public static void main(String[] args) {
		try {
			int[] numeros = null;
			numeros = new int[-5];
			numeros[0] = 5;
			numeros[9] = 6;
		} catch (NullPointerException error) {
			System.out.println("ERROR: Al manipular el array");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("ERROR: Al acceder a una celda del array");
		} catch (Exception error) {
			System.out.println("ERROR: Al ejecutar el programa");
		}
	}

}
