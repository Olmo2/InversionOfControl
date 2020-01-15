package com.olmo.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olmo.IoC.Beans.Autor.AutorBean;
import com.olmo.IoC.Servicio.ComponenteNombres;

@Controller
public class Rutas {
	
	
	@Autowired
	AutorBean juan;
	
	@Autowired 
	AutorBean maria;
	
	@Autowired
	@Qualifier("juan")
	AutorBean pedro;
	
	@Autowired
	ComponenteNombres componenteNombres;
	

	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		String salida="";
		for(String str:componenteNombres.getNombres()) {
			
			salida+= "<br>" + str;
			
		}
		
		return  salida;
		
	}
	
	
	
	
	
	@GetMapping("/singleton1")
	@ResponseBody
	public String rutaSingleton() {
		
		
		
		return  componenteNombres.toString();
		
	}
	
	
	
	
	
	
	
}
