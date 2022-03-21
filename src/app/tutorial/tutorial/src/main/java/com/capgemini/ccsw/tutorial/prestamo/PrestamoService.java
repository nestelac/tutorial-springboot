package com.capgemini.ccsw.tutorial.prestamo;

import org.springframework.data.domain.Page;

import com.capgemini.ccsw.tutorial.prestamo.model.Prestamo;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoDto;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoSearchDto;

import antlr.collections.List;

/**
* @author ccsw
*/
public interface PrestamoService {

    /**
    * Recupera un {@link com.capgemini.ccsw.tutorial.author.model.Author} a través de su ID
    * @param id
    * @return
    */
    Prestamo get(Long id);

    /**
    * Método para recuperar un listado paginado de {@link com.capgemini.ccsw.tutorial.author.model.Author}
    * @param dto
    * @return
    */
    Page<Prestamo> findPage(PrestamoSearchDto dto);

    /**
    * Método para crear o actualizar un {@link com.capgemini.ccsw.tutorial.author.model.Author}
    * @param id
    * @param data
    */
    void save(Long id, PrestamoDto data);

    /**
    * Método para crear o actualizar un {@link com.capgemini.ccsw.tutorial.author.model.Author}
    * @param id
    */
    void delete(Long id);

    /**
    * Recupera un listado de autores
    * @return
    */
    List findAll();

	/**
	* {@inheritDoc}
	*/
	Prestamo get1(Long id);

	/**
	* {@inheritDoc}
	*/
	Page<Prestamo> findPage1(PrestamoSearchDto dto);
}
