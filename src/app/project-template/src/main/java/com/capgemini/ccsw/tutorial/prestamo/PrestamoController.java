package com.capgemini.ccsw.tutorial.prestamo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoDto;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoSearchDto;
import com.capgemini.ccsw.tutorial.author.model.AuthorDto;
import com.capgemini.ccsw.tutorial.config.mapper.BeanMapper;

import antlr.collections.List;

/**
* @author ccsw
*/
@RequestMapping(value = "/prestamo")
@RestController
@CrossOrigin(origins = "*")
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @Autowired
    BeanMapper beanMapper;

    /**
    * Método para recuperar un listado paginado de {@link com.capgemini.ccsw.tutorial.author.model.Author}
    * @param dto
    * @return
    */
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Page<PrestamoDto> findPage(@RequestBody PrestamoSearchDto dto) {

      return this.beanMapper.mapPage(this.prestamoService.findPage(dto), PrestamoDto.class);
    }

    /**
    * Método para crear o actualizar un {@link com.capgemini.ccsw.tutorial.prestamo.model.Prestamo}
    * @param id
    * @param data datos de la entidad 
    */
    @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
    public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody PrestamoDto data) {

        this.prestamoService.save(id, data);
    }

    /**
    * Método para crear o actualizar un {@link com.capgemini.ccsw.tutorial.author.model.Author}
    * @param id PK de la entidad
    */
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {

        this.prestamoService.delete(id);
    }
    /**
    * Recupera un listado de autores
    * @return
    */
    //public List findAll() {

      //  List<Author> authors = this.authorService.findAll();

        //return this.beanMapper.mapList(authors, AuthorDto.class);
    //}
}