
package com.backendap.portfolio.Service;

import com.backendap.portfolio.Models.Experiencia;
import com.backendap.portfolio.Repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {

   private final ExperienciaRepo experienciaRepo;
    
    
    @Autowired
    
    public ExperienciaService(ExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
       
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia (Long id){
        experienciaRepo.deleteById(id);
    }
    
}
