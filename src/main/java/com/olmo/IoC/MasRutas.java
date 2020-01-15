package com.olmo.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olmo.IoC.Beans.Almacenamiento;
import com.olmo.IoC.Beans.Alumno.AlumnoBean;
import com.olmo.IoC.Beans.Profesor.ProfesorBean;
import com.olmo.IoC.Servicio.ComponenteNombres;

@Controller
public class MasRutas {
	
	
	
	@Autowired
	@Qualifier("profesorado")
	Almacenamiento marcos;
	
	@Autowired
	@Qualifier("profesorado")
	Almacenamiento julio;
	
	@Autowired
	@Qualifier("alumnado")
	Almacenamiento olmo;
	
	
	
	@GetMapping("/ficheros/profesorado")
	@ResponseBody
	public String rutaProfesor() {
		
		
		
		return  marcos.getPath() +" " + marcos.getSize() +"<br>"+ julio.getPath() +" " + julio.getSize();
		
	}
	
	@GetMapping("/ficheros/alumnado")
	@ResponseBody
	public String rutaAlumno() {
		
		
		
		return  olmo.getPath() +" " + olmo.getSize();
		
	}
	
	
	
	
	

}
