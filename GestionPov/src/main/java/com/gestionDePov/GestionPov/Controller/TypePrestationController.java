package com.gestionDePov.GestionPov.Controller;

import com.gestionDePov.GestionPov.DTO.TypePrestationDTO;
import com.gestionDePov.GestionPov.Model.TypePrestation;
import com.gestionDePov.GestionPov.Service.TypePrestationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TypePrestation")
public class TypePrestationController {
    @Autowired
    private TypePrestationService typePrestation;

    @GetMapping("/GetTypePrestation")
    public TypePrestationDTO GetTypePrestation(TypePrestationDTO typePrestations){
        return typePrestation.save(typePrestations);
    }
    @GetMapping("/findAllType")
    public List<TypePrestationDTO> registerNewStudent(){

        return typePrestation.findAlltype();

    }
    @PostMapping("/AddType")
    public TypePrestationDTO getType(@RequestBody TypePrestationDTO type) {
        return typePrestation.save(type);
    }

//    @DeleteMapping("/DeleteType/{type}")
//    public void deleteType(@PathVariable("type") Long type) {
//        typeService.delete(type);
//    }
}
