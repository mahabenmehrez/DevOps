package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Universite;
import com.example.maha_benmehrez1.repositories.UniversiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServiceImp implements IUniversiteService {
    @Autowired

    private  UniversiteRepository universiteRepositoryFinal;
    private UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieverAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieverUniversite(Universite universite) {
        return universite;
    }

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite deleteUniversite(Universite universite) {
        if (universite != null) {
            universiteRepository.delete(universite);
        }
        return universite;
    }
}