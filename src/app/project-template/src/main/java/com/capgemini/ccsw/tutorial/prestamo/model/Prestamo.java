package com.capgemini.ccsw.tutorial.prestamo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author ccsw
*/
@Entity
@Table(name = "Prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nameGam", nullable = false)
    private String nameGame;

    @Column(name = "nameCli")
    private String nameCli;

   @Column(name = "fechaPres", nullable = false)
    private Long fechaPres;

    @Column(name = "fechaDev")
    private Long fechaDev;

	private String nameGam;
    
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

        return this.getNameGam();
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
    public void setNameCli(String nameCli) {

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

    /**
    * @return fechaDev
    */
    public Long getFechaDev() {

        return this.fechaDev;
    }

    /**
    * @param fechaDev new value of {@link #getfechaDev).
    */
    public void setFechaDev(Long fechaDev) {

        this.fechaDev = fechaDev;
    }
}