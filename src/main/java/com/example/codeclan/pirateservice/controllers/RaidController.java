package com.example.codeclan.pirateservice.controllers;


import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping
    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Raid> getRaid(@PathVariable Long id){
        return raidRepository.findById(id);
    }

}
