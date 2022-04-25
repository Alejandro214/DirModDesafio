import java.util.Scanner;

import model.Tecla;

public class App {
    public static void main(String[] args) throws Exception {
        Tecla tecla = new Tecla();
		
		Scanner entradaEscaner = new Scanner (System.in);
		System.out.println("Ingresa la cadena que sea escribir: ");
		String entradaTeclado = entradaEscaner.nextLine(); 
		System.out.println(tecla.calcularSecuenciasTeclas(entradaTeclado.toUpperCase()));
    }
}
