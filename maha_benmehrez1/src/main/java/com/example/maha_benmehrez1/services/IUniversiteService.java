package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieverAllUniversites();
    Universite retrieverUniversite(Universite universite);
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    Universite deleteUniversite(Universite universite);
}
