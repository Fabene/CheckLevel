package com.example.checklevel.service;

import com.example.checklevel.model.departement;
import lombok.AllArgsConstructor;
import com.example.checklevel.repository.departementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class departementServiceImpl implements departementService{
    private final departementRepository departementRepository;

    @Override
    public departement Create(departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<departement> Read() {
        return departementRepository.findAll();
    }

    @Override
    public departement Update(Long id, departement departement) {
        return departementRepository.findById(id)
                .map(d->{
                    d.setDepartement_name(departement.getDepartement_name());
                    d.setEmployee(departement.getEmployee());
                    return departementRepository.save(d);
                }).orElseThrow(()->new RuntimeException("departement non trouvé"));
    }

    @Override
    public String Delete(Long id) {
        departementRepository.deleteById(id);
        return "departement supprimé";
    }
}
