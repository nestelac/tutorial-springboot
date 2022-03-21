package com.capgemini.ccsw.tutorial.prestamo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.ccsw.tutorial.prestamo.model.Prestamo;

/**
* @author ccsw
*/
public interface PrestamoRepository extends CrudRepository<Prestamo, Long> {

    /**
    * Método para recuperar un listado paginado de {@link com.capgemini.ccsw.tutorial.prestamo.model.Prestamo}
    * @param page
    * @return
    */
    Page<Prestamo> findAll(Pageable pageable);

}
