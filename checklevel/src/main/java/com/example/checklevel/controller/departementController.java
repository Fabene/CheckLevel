package com.example.checklevel.controller;

import com.example.checklevel.model.departement;
import com.example.checklevel.service.departementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departement")
@AllArgsConstructor
public class departementController {
    private final departementService departementService;

    @PostMapping("/create")
    public departement create(@RequestBody departement departement){
        return departementService.Create(departement);
    }

    @GetMapping("/read")
    public List<departement> read(){
        return departementService.Read();
    }
    @PutMapping("/update/{id}")
    public departement update(@PathVariable Long id,@RequestBody departement departement){
        return departementService.Update(id,departement);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return departementService.Delete(id);
    }
}
