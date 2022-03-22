package com.capgemini.ccsw.tutorial.prestamo.model;

/**
* @author ccsw
*/
public class PrestamoDto {

    private Long id;

    private String nameGam;

    private String nameCli;
  
    private Long fechaPres;
  
    private Long fechaDev;

    /**
    * @return id
    */
    public Long getId() {

        return this.id;
    }

    /**
    * @param id new value of {@link #getid}.
    */
    public void setId(Long id) {

        this.id = id;
    }

    /**
    * @return nameGam
    */
    public String getNameGam() {

        return this.nameGam;
    }

    /**
    * @param nameGam new value of {@link #getnameGam}.
    */
    public void setNameGam(String nameGam) {

        this.nameGam = nameGam;
    }

  /**
    * @return nameCli
    */
    public String getNameCli() {

        return this.nameCli;
    }

    /**
    * @param nameCli new value of {@link #getnameCli}.
    */
    public void setNameCLi(String nameCli) {

        this.nameCli = nameCli;
    }
  
    /**
    * @return fechaPres
    */
    public Long getFechaPres() {

        return this.fechaPres;
    }

    /**
    * @param fechaPres new value of {@link #getfechaPres}.
    */
    public void setFechaPres(Long fechaPres) {

        this.fechaPres = fechaPres;
    }

}
