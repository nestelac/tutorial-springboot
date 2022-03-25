package com.capgemini.ccsw.tutorial.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ccsw.tutorial.clientes.model.ClientesDto;
import com.devonfw.module.beanmapping.common.api.BeanMapper;

/**
 * @author ccsw
 */
@RequestMapping(value = "/clientes")
@RestController
@CrossOrigin(origins = "*")
public class ClientesController {

  @Autowired
  ClientesService clientesService;

  @Autowired
  BeanMapper beanMapper;

  /**
  * Método para recuperar todas las {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
  * @return
  */
  @RequestMapping(path = "", method = RequestMethod.GET)
  public List<ClientesDto> findAll() {

    return this.beanMapper.mapList(this.clientesService.findAll(), ClientesDto.class);
  }

  /**
  * Método para crear o actualizar una {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
  * @param dto
  * @return
  */
  @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
  public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody ClientesDto dto) {

    this.clientesService.save(id, dto);
  }

  /**
  * Método para borrar una {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
  * @param id
  */
  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable("id") Long id) {

    this.clientesService.delete(id);

  }
}