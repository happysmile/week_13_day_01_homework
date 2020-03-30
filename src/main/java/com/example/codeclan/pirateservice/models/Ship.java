package com.example.codeclan.pirateservice.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "ship")
    private List<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }

    public Ship(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(ArrayList<Pirate> pirates) {
        this.pirates = pirates;
    }

    public void addPirate(Pirate pirate){
        this.pirates.add(pirate);
    }

}
