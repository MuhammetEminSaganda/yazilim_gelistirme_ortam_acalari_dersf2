package tr.medipol.yazilimaraclari.java;

public class metinIslemleri {

	public static void main(String[] args) {
		
		String ornek1 = "Merhaba arkadaslar";
		String sonuc1 = metinIslemleri.buyukHarfeCevir(ornek1);
		System.out.println(ornek1 + "->" + sonuc1);
		

	}
	
	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}
	
	

}
