package com.gestionDePov.GestionPov.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class SuiviDTO {
    public int idSuivi;
    public Boolean OffreCommercial;
    public float   Montant;
    public TypePrestationDTO TypePres;
    public String CompteRendu;
}
