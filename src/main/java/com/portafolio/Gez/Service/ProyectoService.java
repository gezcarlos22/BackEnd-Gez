/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.Gez.Service;

import com.portafolio.Gez.Entity.Proyecto;
import com.portafolio.Gez.Repository.ProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional//persistencia en base de datos
public class ProyectoService {

    @Autowired
    ProyectoRepository rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Proyecto getOne(int id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }      
    
    public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
           
     
     
    
    
}