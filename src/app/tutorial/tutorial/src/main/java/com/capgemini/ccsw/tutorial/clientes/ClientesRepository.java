package com.capgemini.ccsw.tutorial.clientes;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.ccsw.tutorial.clientes.model.Clientes;

/**
* @author ccsw
*/
public interface ClientesRepository extends CrudRepository<Clientes, Long> {

}
