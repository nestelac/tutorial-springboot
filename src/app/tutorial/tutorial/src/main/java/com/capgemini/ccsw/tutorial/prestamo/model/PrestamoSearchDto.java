package com.capgemini.ccsw.tutorial.prestamo.model;

import org.springframework.data.domain.Pageable;

/**
* @author ccsw
*/
public class PrestamoSearchDto {

    private Pageable pageable;

    /**
    * @return pageable
    */
    public Pageable getPageable() {

        return this.pageable;
    }

    /**
    * @param pageable new value of {@link #getPageable}.
    */
    public void setPageable(Pageable pageable) {

        this.pageable = pageable;
    }

}
