/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2s.services;
import com.t2s.entities.Carro;
import com.t2s.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Murilo Xavier
 */
@Service
public class CarroServiceImpl implements CarroService{
    private CarroRepository carroRepository;
    
    @Autowired
    public void setCarroRepository(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }
    
    @Override
    public Iterable<Carro> listAllCarros(){
        return carroRepository.findAll();
    }
    @Override
    public Carro getCarroById(Integer id){
        if(carroRepository.findOne(id) != null){
            return carroRepository.findOne(id);
        }else{
            return null;
        }
    }
    @Override
    public Carro saveCarro(Carro carro){
        return carroRepository.save(carro);
    }
    @Override
    public void deleteCarro(Integer id){
        carroRepository.delete(id);
    }    
}
