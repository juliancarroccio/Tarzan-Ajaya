package tarzan;

public class Nodo {
	private int coordenadaX;
	private int coordenadaY;
	
	public Nodo(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public double calcularDistancia(Nodo nodoDos){
		return Math.sqrt(Math.pow(nodoDos.getCoordenadaX() - this.getCoordenadaX() , 2) + Math.pow(nodoDos.getCoordenadaY() - this.getCoordenadaY() , 2));
	}
	
}
