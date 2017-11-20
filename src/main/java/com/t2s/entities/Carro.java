/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2s.entities;
import javax.persistence.*;
/**
 *
 * @author Murilo Xavier
 */
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;
    
    @Column(name = "modelo", nullable = false)
    private String modelo;
    
    @Column(name = "marca", nullable = false)
    private String marca;
    
    @Column(name = "cor", nullable = false)
    private String cor;

        public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
