package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Chambre;
import com.example.maha_benmehrez1.repositories.ChambreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IChambreServiceImp implements IChambreService {
    @Autowired

    private  ChambreRepository chambreRepositoryFinal;

    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieverAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieverChambre(Chambre chambre) {
        return chambre;
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    @Override
    public Chambre deleteChambre(Chambre chambre) {
        if (chambre != null) {
            chambreRepository.delete(chambre);
        }
        return chambre;
    }

}
