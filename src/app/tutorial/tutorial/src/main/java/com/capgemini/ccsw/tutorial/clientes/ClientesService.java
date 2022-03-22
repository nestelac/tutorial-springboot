package com.capgemini.ccsw.tutorial.clientes;

import java.util.List;

import com.capgemini.ccsw.tutorial.clientes.model.Clientes;
import com.capgemini.ccsw.tutorial.clientes.model.ClientesDto;

/**
* @author ccsw
*
*/
public interface ClientesService {

    /**
    * Recupera una {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes} a partir de su ID
    * @param id
    * @return
    */
    Clientes get(Long id);

    /**
    * Método para recuperar todas las {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
    * @return
    */
    List<Clientes> findAll();

    /**
    * Método para crear o actualizar una {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
    * @param dto
    * @return
    */
    void save(Long id, ClientesDto dto);

    /**
    * Método para borrar una {@link com.capgemini.ccsw.tutorial.clientes.model.Clientes}
    * @param id
    */
    void delete(Long id);
}
