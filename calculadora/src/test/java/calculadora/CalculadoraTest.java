package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();

		assertEquals(c.somaInteiros(2, 2), 4);
	}

	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertEquals(c.somaInteiros(3, 7), 10);

	}
	
	@Test
	void doisSubtraiDoisEspera0() {
		Calculadora c = new Calculadora();

		assertEquals(c.subtraiInteiros(2, 2), 0);
	}
	
	@Test
	void vinteSubtrai10Espera10() {
		Calculadora c = new Calculadora();

		assertEquals(c.subtraiInteiros(20, 10), 10);
	}

	@Test
	void doisMultiplicaDoisEspera4() {
		Calculadora c = new Calculadora();
		assertEquals(c.multiplicaInteiros(2, 2), 4);

	}

	@Test
	void doisMultiplicaTresEspera6() {
		Calculadora c = new Calculadora();
		assertEquals(c.multiplicaInteiros(2, 3), 6);

	}
	
	@Test
	void doisDivideDoisEspera1() {
		Calculadora c = new Calculadora();
		assertEquals(c.dividiInteiros(2, 2), 1);

	}
	
	@Test
	void vinteDivideDoisEspera10() {
		Calculadora c = new Calculadora();
		assertEquals(c.dividiInteiros(20, 2), 10);

	}
	
	

}
