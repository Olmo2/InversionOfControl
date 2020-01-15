package com.olmo.IoC.Beans.Alumno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.olmo.IoC.Beans.Almacenamiento;


@Component
@Qualifier("alumnado")
public class AlumnoBean implements Almacenamiento {

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return "/ficheros/alumnado";
	}

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return 100;	
	}
	
	

	
	
}
