package com.gestionDePov.GestionPov.Service;

import com.gestionDePov.GestionPov.DTO.ContactDTO;


import java.util.List;

public interface ContactService {
    ContactDTO save(ContactDTO contact);
    void delete(Long contact);

    List<ContactDTO> findAll();

}
