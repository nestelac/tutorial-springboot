package com.capgemini.ccsw.tutorial.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ccsw.tutorial.clientes.model.Clientes;
import com.capgemini.ccsw.tutorial.clientes.model.ClientesDto;

/**
* @author ccsw
*
*/
@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    ClientesRepository clientesRepository;

    /**
    * {@inheritDoc}
    */
    @Override
    public Clientes get(Long id) {

        return this.clientesRepository.findById(id).orElse(null);
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public List<Clientes> findAll() {

        return (List<Clientes>) this.clientesRepository.findAll();
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public void save(Long id, ClientesDto dto) {

        Clientes cliente = null;

        if (id == null)
            cliente = new Clientes();
        else
            cliente = this.get(id);

        cliente.setName(dto.getName());

        this.clientesRepository.save(cliente);
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public void delete(Long id) {

        this.clientesRepository.deleteById(id);

    }
}