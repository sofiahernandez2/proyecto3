/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.repository;

import com.grupo10.app.rents.entities.Category;
import com.grupo10.app.rents.entities.Client;
import com.grupo10.app.rents.entities.Quadbike;
import com.grupo10.app.rents.interfaces.ICategoryRepository;
import com.grupo10.app.rents.interfaces.IClientRepository;
import com.grupo10.app.rents.interfaces.IQuadbikeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepository {
    
    @Autowired
    IClientRepository repository;
    
    public Iterable<Client> getAll(){
        return repository.findAll();
    }
    
    public Optional<Client> findById(Integer id){
        Optional<Client> response= repository.findById(id);
        return response;
    }
    
    public Boolean existsById(Integer id){
        return repository.existsById(id);
    }
    
    public void deleteById(Integer id){
        repository.deleteById(id);
    }
    
    public Client save(Client client){
        return repository.save(client);
    }
    
}
