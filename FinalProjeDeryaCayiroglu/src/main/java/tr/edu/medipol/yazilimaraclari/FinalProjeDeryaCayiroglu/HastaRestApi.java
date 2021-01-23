package tr.edu.medipol.yazilimaraclari.FinalProjeDeryaCayiroglu;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hasta")
public class HastaRestApi {

	public static List<String> hastalar = new ArrayList<>();
	
	@GetMapping("/goruntule")
	public List<String> goruntule(){
		return hastalar;
	}
	
	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
	}
	
	@PostMapping("/sil")
	public String sil(@RequestBody String ad) {
		int index = hastalar.indexOf(ad);
		hastalar.remove(index);
		return ad;
	}
}
