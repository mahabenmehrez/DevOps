package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Foyer;
import com.example.maha_benmehrez1.repositories.FoyerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IFoyerServiceImp implements IFoyerService {
    @Autowired

    private  FoyerRepository foyerRepositoryFinal;

    private FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieverAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieverFoyer(Foyer foyer) {
        return foyer;
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    @Override
    public Foyer deleteFoyer(Foyer foyer) {
        if (foyer != null) {
            foyerRepository.delete(foyer);
        }
        return foyer;
    }}