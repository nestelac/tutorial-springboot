package com.capgemini.ccsw.tutorial.prestamo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.capgemini.ccsw.tutorial.prestamo.model.Prestamo;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoDto;
import com.capgemini.ccsw.tutorial.prestamo.model.PrestamoSearchDto;

/**
* @author ccsw
*
*/
@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    PrestamoRepository prestamoRepository;

    /**
    * {@inheritDoc}
    */
    @Override
    public Prestamo get(Long id) {

        return this.prestamoRepository.findById(id).orElse(null);
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public antlr.collections.List findAll1() {

        return (antlr.collections.List) this.prestamoRepository.findAll();
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public void save(Long id, PrestamoDto dto) {

        Prestamo prestamo = null;

        if (id == null)
            prestamo = new Prestamo();
        else
            prestamo = this.get(id);

        prestamo.setNameCli(dto.getNameCli());
        
        prestamo.setNameGam(dto.getNameGam());
        
        prestamo.setFechaPres(dto.getFechaPres());
        
        prestamo.setFechaDev(dto.getFechaDev());

        this.prestamoRepository.save(prestamo);
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public void delete(Long id) {

        this.prestamoRepository.deleteById(id);

    }

	@Override
	public Page<Prestamo> findPage(PrestamoSearchDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public antlr.collections.List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestamo get1(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Prestamo> findPage1(PrestamoSearchDto dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
