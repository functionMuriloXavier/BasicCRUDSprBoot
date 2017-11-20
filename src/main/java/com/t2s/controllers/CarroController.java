/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2s.controllers;
import com.t2s.entities.Carro;
import com.t2s.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Murilo Xavier
 */
@Controller
public class CarroController {
    private CarroService carroService;
    @Autowired
    public void setCarroService(CarroService carroService){
        this.carroService = carroService;
    }
    /**
     * Lista todos os produtos.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/carros", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("carros", carroService.listAllCarros());
        return "carros";
    }
    /**
     * Visualiza um carro específico por seu ID.
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("carros/{id}")
    public String showCarro(@PathVariable Integer id, Model model) {
        if(carroService.getCarroById(id) != null){
            model.addAttribute("carros", carroService.getCarroById(id));
            return "carroshow";
        }else{
            return "redirect:/carros";
        }
    }
    // Exibe um formulário de edição dos dados de um carro
    @RequestMapping("carros/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("carros", carroService.getCarroById(id));
        return "carroform";
    }
    /**
     * Novo carro.
     *
     * @param model
     * @return
     */
    @RequestMapping("carros/new")
        public String newCarro(Model model) {
        model.addAttribute("carros", new Carro());
        return "carroform";
    }
    /**
     * Salva um carro na base de dados.
     *
     * @param carro
     * @return
     */
    @RequestMapping(value = "carros", method = RequestMethod.POST)
    public String saveCarro(Carro carro) {
        carroService.saveCarro(carro);
        return "redirect:/carros/" + carro.getId();
    }
    /**
     * Deleta um carro por seu id.
     *
     * @param id
     * @return
     */
    @RequestMapping("carros/delete/{id}")
    public String delete(@PathVariable Integer id) {
        carroService.deleteCarro(id);
        return "redirect:/carros";
    }
}
