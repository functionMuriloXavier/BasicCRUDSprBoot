/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2s.repositories;
import com.t2s.entities.Carro;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Murilo Xavier
 */
public interface CarroRepository extends CrudRepository<Carro, Integer> {
    
}
