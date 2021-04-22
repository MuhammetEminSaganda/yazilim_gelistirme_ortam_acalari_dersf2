package tr.medipol.yazilimaraclari.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class metinIslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
		String ornek = "merhaba arkadaslar";
		String sonuc = metinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADASLAR", sonuc);
	}

}
