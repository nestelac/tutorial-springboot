package com.capgemini.ccsw.tutorial.config.mapper;

import org.springframework.data.domain.Page;

import com.capgemini.ccsw.tutorial.author.model.Author;
import com.capgemini.ccsw.tutorial.author.model.AuthorDto;
import com.capgemini.ccsw.tutorial.prestamo.model.Prestamo;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoDto;

public class BeanMapper {

	public Page<AuthorDto> mapPage1(Page<Author> findPage, Class<AuthorDto> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<AuthorDto> mapPage(Page<Author> page, Class<AuthorDto> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Page<PrestamoDto> mapPage2(Page<Prestamo> findPage, Class<PrestamoDto> class1) {
		// TODO Auto-generated method stub
		return null;
	}


}
