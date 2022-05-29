package com.backendap.portfolio.Repository;

import com.backendap.portfolio.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
