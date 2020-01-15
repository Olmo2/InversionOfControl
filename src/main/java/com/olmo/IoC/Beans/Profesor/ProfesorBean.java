package com.olmo.IoC.Beans.Profesor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.olmo.IoC.Beans.Almacenamiento;


@Component
@Qualifier("profesorado")
public class ProfesorBean implements Almacenamiento {

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return "/ficheros/profesorado";
	}

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return 2000;	
	}
	
	
	
	
}
