package com.gestionDePov.GestionPov.Repository;

import com.gestionDePov.GestionPov.Model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ApplianceRepo extends JpaRepository<Appliance,Long> {
}
