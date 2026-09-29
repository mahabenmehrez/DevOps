package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieverAllEtudiants();
    Etudiant retrieverEtudiant(Etudiant etudiant);
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant deleteEtudiant(Etudiant etudiant);
}
