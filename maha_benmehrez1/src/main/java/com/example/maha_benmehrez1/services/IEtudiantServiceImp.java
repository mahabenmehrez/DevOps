package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Etudiant;
import com.example.maha_benmehrez1.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantService {
    @Autowired
    private  EtudiantRepository etudiantRepositoryFinal;
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieverAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant retrieverEtudiant(Etudiant etudiant) {
        return etudiant;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant deleteEtudiant(Etudiant etudiant) {
        if (etudiant != null) {
            etudiantRepository.delete(etudiant);
        }
        return etudiant;
    }
}