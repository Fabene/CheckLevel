package com.example.checklevel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

import java.util.Collection;


@Entity
@Table(name = "departement")
@Getter
@Setter
@AllArgsConstructor
public class departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String departement_name;
    @OneToMany
    private Collection<Employee> employee;


    public departement() {

    }
}
