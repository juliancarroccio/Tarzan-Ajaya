package test;

import org.junit.Test;

import tarzan.Tarzan;

public class TarzanTest {
	@Test
	public void casoSugerido() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "01_CasoSugerido.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "01_CasoSugerido.out");
	}
	
	@Test
	public void ningunArbol50() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "02_NingunArbol50Metros.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "02_NingunArbol50Metros.out");
	}
	
	@Test
	public void soloUnArbol() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "03_SoloHayUnArbol.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "03_SoloHayUnArbol.out");
	}
	
	@Test
	public void variasRutas() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "04_VariasRutas.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "04_VariasRutas.out");
	}
	
	@Test
	public void unCamino() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "05_UnSoloCamino.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "05_UnSoloCamino.out");
	}
	
	@Test
	public void fatiga() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_PROPIOS + "06_loteFatiga.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_PROPIOS + "06_loteFatiga.out");
	}
	
	@Test
	public void caso00() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "00.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "00.out");
	}
	
	@Test
	public void caso01() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "01.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "01.out");
	}
	
	@Test
	public void caso02() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "02.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "02.out");
	}
	
	@Test
	public void caso03() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "03.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "03.out");
	}
	
	@Test
	public void caso04() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "04.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "04.out");
	}
	
	@Test
	public void caso05() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "05.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "05.out");
	}
	
	@Test
	public void caso06() {
		Tarzan tarzan = new Tarzan(PATH_LOTES_IN_CATEDRA + "06.in");
		tarzan.resolver();
		tarzan.grabarSalida(PATH_LOTES_OUT_CATEDRA + "06.out");
	}
	
	public static final String PATH_LOTES_IN_PROPIOS = "Preparacion De Prueba/Lote De Prueba/IN/";
	public static final String PATH_LOTES_OUT_PROPIOS = "Preparacion De Prueba/Lote De Prueba/OUT/";
	
	public static final String PATH_LOTES_IN_CATEDRA = "Preparacion De Prueba/Lote De Prueba/IN/LoteDePruebaCatedra/";
	public static final String PATH_LOTES_OUT_CATEDRA = "Preparacion De Prueba/Lote De Prueba/OUT/LoteDePruebaCatedra/";
}
