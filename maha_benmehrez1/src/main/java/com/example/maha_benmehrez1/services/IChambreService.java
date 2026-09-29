package com.example.maha_benmehrez1.services;
import java.util.List;

import com.example.maha_benmehrez1.Entities.Chambre;
public interface IChambreService {
    List<Chambre> retrieverAllChambres();
    Chambre retrieverChambre(Chambre chambre);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    Chambre deleteChambre(Chambre chambre);
}
