/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendap.portfolio.Repository;

import com.backendap.portfolio.Models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepo extends JpaRepository<Skills, Long>{
    
}
