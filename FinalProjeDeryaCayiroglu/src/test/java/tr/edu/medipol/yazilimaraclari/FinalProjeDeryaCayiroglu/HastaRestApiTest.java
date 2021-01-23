package tr.edu.medipol.yazilimaraclari.FinalProjeDeryaCayiroglu;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.Test;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class HastaRestApiTest {
	
	HastaRestApi hastaRestApi = new HastaRestApi();
	private static List<String> hastalar = HastaRestApi.hastalar;
	
	@Test
	public void testGoruntule() {
		List<String> sonuc = hastaRestApi.goruntule();
		assertEquals(hastalar,sonuc);
	}

	@Test
	public void testEkle() {
		String ad = "Derya";
		String sonuc = hastaRestApi.ekle(ad);
		assertEquals("Derya",sonuc);
	}

	@Test
	public void testSil() {
		String ad = "Derya";
		HastaRestApi.hastalar.add(ad);
		String sonuc = hastaRestApi.sil(ad);
		assertEquals("Derya",sonuc);
	}

}
