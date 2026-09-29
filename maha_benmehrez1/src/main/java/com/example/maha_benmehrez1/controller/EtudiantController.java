package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Etudiant;
import com.example.maha_benmehrez1.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
@AllArgsConstructor
public class EtudiantController {

    private EtudiantRepository etudiantRepository;

    // ✅ Récupérer tous les étudiants
    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    // ✅ Récupérer un étudiant par ID
    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Etudiant non trouvé"));
    }

    // ✅ Ajouter un étudiant
    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    // ✅ Modifier un étudiant
    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id,
                                   @RequestBody Etudiant etudiantDetails) {

        Etudiant etudiant = etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Etudiant non trouvé"));

        etudiant.setNomEt(etudiantDetails.getNomEt());
        etudiant.setPrenomEt(etudiantDetails.getPrenomEt());
        etudiant.setCin(etudiantDetails.getCin());
        etudiant.setEcole(etudiantDetails.getEcole());
        etudiant.setDateNaissance(etudiantDetails.getDateNaissance());

        return etudiantRepository.save(etudiant);
    }

    // ✅ Supprimer un étudiant
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantRepository.deleteById(id);
    }
}