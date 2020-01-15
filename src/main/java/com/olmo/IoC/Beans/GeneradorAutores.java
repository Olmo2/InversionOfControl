package com.olmo.IoC.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.olmo.IoC.Beans.Autor.AutorBean;

@Configuration
public class GeneradorAutores {

	@Bean
	@Scope("prototype")
	public AutorBean juan() {
		AutorBean autor = new AutorBean();
		autor.setNombre("Juan");
		autor.setEdad("22");
		
		return autor;
		
	}
	
	@Bean
	public AutorBean maria() {
		AutorBean autor = new AutorBean();
		autor.setNombre("Maria");
		autor.setEdad("25");
		
		return autor;
	}
	
}
