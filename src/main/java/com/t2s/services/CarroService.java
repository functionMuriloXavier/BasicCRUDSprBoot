/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2s.services;
import com.t2s.entities.Carro;
/**
 *
 * @author Murilo Xavier
 */
public interface CarroService {
    Iterable<Carro> listAllCarros();

    Carro getCarroById(Integer id);

    Carro saveCarro(Carro carro);

    void deleteCarro(Integer id);
}
