package tarzan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Tarzan {
	private boolean[][] matrizBinaria;
	private int[][] matrizAdy;
	private ArrayList<Nodo> nodos;
	private int cantNodos;
	private boolean[] visitado;
	private Stack<Integer> pila;
	private ArrayList<Integer> recorrido;
	private int nodoInicio;
	private int nodoLlegada;
	private Queue<Integer> cola;
	
	/*
	 * AGREGAR LO QUE FALTA
	 */
	
	
	/// METODO DE LECTURA DEL ARCHIVO DE ENTRADA
	public Tarzan(String path) {
		nodos = new ArrayList<Nodo>();
		this.recorrido = new ArrayList<Integer>();
		Scanner entrada = null;
		
		try {
			entrada = new Scanner(new File(path));
			
			while(entrada.hasNextLine()) {
				nodos.add(new Nodo(entrada.nextInt(), entrada.nextInt()));
			}
			this.cantNodos = nodos.size();
			this.matrizAdy = new int[this.cantNodos][this.cantNodos];
			this.matrizBinaria = new boolean[this.cantNodos][this.cantNodos];
			this.visitado = new boolean[this.cantNodos];
			this.nodoInicio = 0;
			this.nodoLlegada = this.cantNodos - 1;
			this.pila = new Stack<>();
			this.cola = new LinkedList<>();
			conectar();
//			printearMatriz();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			entrada.close();
		}
	}
	
	private void conectar() {
		double costo;
		for (int i = 0; i < this.cantNodos; i++) {
			for (int j = i+1; j < this.cantNodos; j++) {
				if((costo=this.nodos.get(i).calcularDistancia(this.nodos.get(j))) <= 50){
					if(costo!=0) {
						this.matrizAdy[i][j] = (int) costo;
						this.matrizBinaria[i][j] = true;
					}
				}
			}
		}
	}

	public void resolver() {
		algoritmoDFS(this.nodoInicio);
	}

	private void printearRecorrido() {
		if(recorrido.size() > 1) {
			if(nodos.size() > 1) {
				for (int i = 0; i < recorrido.size(); i++) {
					System.out.println(nodos.get(recorrido.get(i)).getCoordenadaX() + " " + nodos.get(recorrido.get(i)).getCoordenadaY());
				}
			} 
		} 
		
		if(recorrido.size() == 1) {
			if(nodos.size() > 1) {
				System.out.println("No Hay RUTA.");
			} else {
				for (int i = 0; i < recorrido.size(); i++) {
					System.out.println(nodos.get(recorrido.get(i)).getCoordenadaX() + " " + nodos.get(recorrido.get(i)).getCoordenadaY());
				}
			}
		}
	}
	
	private void printearMatriz() {
		for (int i = 0; i < this.cantNodos; i++) {
			for (int j = 0; j < this.cantNodos; j++) {
				System.out.print(this.matrizAdy[i][j] + " ");
			}
			System.out.print(System.lineSeparator());
		}
	}

	private void algoritmoDFS(int nodoInicial) {
		int ady=0;
		int v = 0;
		
		visitado[nodoInicial] = true;
		pila.push(nodoInicial);
		
		while(!pila.isEmpty()) {
			
			if(recorrido.size()>1 && ady==0 && v!=nodoLlegada) {
				recorrido.remove(recorrido.size() - 1);
			}
			
			v = pila.pop();
			visitado[v] = true;
			recorrido.add(v);
			ady=0;
			
			if(v==nodoLlegada)
				return;
			
			for (int i = v+1; i < this.cantNodos; i++) {
				if(!visitado[i] && matrizBinaria[v][i]==true){
					visitado[i] = true;
					ady++;
					pila.push(i);
				}
			}
		}
	}
	
	public void grabarSalida(String path) {
		PrintWriter salida = null;
		
		try {
			salida = new PrintWriter(new File(path));
			if(recorrido.size() > 1) {
				if(nodos.size() > 1) {
					for (int i = 0; i < recorrido.size(); i++) {
						salida.println(nodos.get(recorrido.get(i)).getCoordenadaX() + " " + nodos.get(recorrido.get(i)).getCoordenadaY());
					}
				} 
			} 
			
			if(recorrido.size() == 1) {
				if(nodos.size() > 1) {
					salida.println("No Hay RUTA.");
				} else {
					for (int i = 0; i < recorrido.size(); i++) {
						salida.println(nodos.get(recorrido.get(i)).getCoordenadaX() + " " + nodos.get(recorrido.get(i)).getCoordenadaY());
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			salida.close();
		}
	}
}
