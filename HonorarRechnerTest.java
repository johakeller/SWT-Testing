package uebung8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aufgabe 3) Testklasse für JUnit-Test einer Klasse HonorarRechner mit den Methoden
 * TextHonorar() und Bilder()
 * 
 * @author Johannes Keller
 * @version 1.0
 */
class HonorarRechnerTest {

	String text1;
	String text2;
	String text3;
	String text4;
	String text5;
	int bilderText1;
	int bilderText2;
	int bilderText3;
	
	@BeforeEach
	void setUp() throws Exception {
		text1 = "Dann tat sie etwas, womit ich wirklich nicht gerechnet hatte. Sie packte"
				+ "die schlechte Idee am Bart und riß ihn hinunter - denn es war ein künstlicher Bart!";
		bilderText1 = 1;
		text2 = "";
		bilderText2 = 0;
		text3 = null;
		bilderText3 = 0;
		text4 = "             ";
		text5 = "- denn es war ein künstlicher Bart!- denn es war ein künstlicher Bart!- denn es war ein künstlicher Bart!- denn es war ein künstlicher Bart!";
	}

	@Test
	void testTextHonorar() {
		assertEquals(HonorarRechner.textHonorar(text1),1.56);
		assertEquals(HonorarRechner.textHonorar(text2),0);
		assertEquals(HonorarRechner.textHonorar(text4),0);
		assertEquals(HonorarRechner.textHonorar(text5),0);
	}
	
	@Test
	void testTextHonorarException() {	
		assertThrows(NullPointerException.class,()->{HonorarRechner.textHonorar(text3);});
	}
	
	@Test
	void testBilder() {
		assertEquals(HonorarRechner.bilder(bilderText1),1);
		assertEquals(HonorarRechner.bilder(bilderText2),0);
		assertEquals(HonorarRechner.bilder(bilderText3),0);
	}

}
