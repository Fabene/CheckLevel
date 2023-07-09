package com.example.checklevel.service;

import com.example.checklevel.model.departement;

import java.util.List;

public interface departementService {
    departement Create(departement departement);

    List<departement> Read();

    departement Update(Long id,departement departement);

    String Delete(Long id);
}
