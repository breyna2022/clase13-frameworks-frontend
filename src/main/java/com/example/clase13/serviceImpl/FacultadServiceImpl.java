
package com.example.clase13.serviceImpl;

import com.example.clase13.entity.Facultad;
import com.example.clase13.repository.FacultadRepository;
import com.example.clase13.service.FacultadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class FacultadServiceImpl implements FacultadService{
    @Autowired
    private FacultadRepository frepository;

    @Override
    public Facultad create(Facultad f) {
        return frepository.save(f);
        
    }

    @Override
    public Facultad update(Facultad f) {
        return frepository.save(f);
        
    }

    @Override
    public void delete(int id) {
        frepository.deleteById(id);
        
    }

    @Override
    public Facultad read(int id) {
        return frepository.getReferenceById(id);
        
    }

    @Override
    public List<Facultad> readAll() {
        return frepository.findAll();        
    }
    
}
