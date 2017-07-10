package generador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fatiga {
	public static void fatiga() {
		PrintWriter fatiga =null;
		
		try {
			fatiga = new PrintWriter(new File("Preparacion De Prueba/Lote De Prueba/IN/" + "06_loteFatiga.in"));
			
			for (int i = 0; i < 999; i++) {
				fatiga.println(i + " " + (i+1));
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fatiga.close();
		}
	}
	
	public static void main(String[] args) {
		fatiga();
	}
	
}
