package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha valida= new Fecha();

	@Test
	void CP1() {
		entradaValida.valida(2,2,2023);
		salidavalida.valida(true);
		assertequals(salidavalida,valida);
	}
	@Test
	void CP2() {
		entradaValida.valida(32,2,2023);
		salidavalida.valida(false);
		assertequals(salidavalida,valida);
	}
	@Test
	void CP3() {
		entradaValida.valida(2,8,2023);
		salidavalida.valida(true);
		assertequals(salidavalida,valida);
	}
	@Test
	void CP4() {
		entradaValida.valida(31,7,2023);
		salidavalida.valida(true);
		assertequals(salidavalida,valida);
	}

}
