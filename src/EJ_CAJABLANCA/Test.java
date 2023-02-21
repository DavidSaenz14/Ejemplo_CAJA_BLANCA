package EJ_CAJABLANCA;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	
	
	void CP1() {
		String cadenaEsperada="El número -2 no es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(-2);
		assertEquals(cadenaEsperada,cadenaObtenida);
	}
	void CP2() {
		String cadenaEsperada="El número 28 es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(28);
		assertEquals(cadenaEsperada,cadenaObtenida);
	}
	void CP3() {
		String cadenaEsperada="El número 8 no es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(8);
		assertEquals(cadenaEsperada,cadenaObtenida);
	}
	

}
