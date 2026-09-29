package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Universite;
import com.example.maha_benmehrez1.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universites")
@AllArgsConstructor
public class UniversiteController {

    private UniversiteRepository universiteRepository;

    // ✅ Récupérer toutes les universités
    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    // ✅ Récupérer une université par ID
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));
    }

    // ✅ Ajouter une université
    @PostMapping
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteRepository.save(universite);
    }

    // ✅ Modifier une université
    @PutMapping("/{id}")
    public Universite updateUniversite(@PathVariable Long id,
                                       @RequestBody Universite universiteDetails) {

        Universite universite = universiteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        universite.setNomUniversite(universiteDetails.getNomUniversite());
        universite.setAddresse(universiteDetails.getAddresse());
        universite.setFoyer(universiteDetails.getFoyer());

        return universiteRepository.save(universite);
    }

    // ✅ Supprimer une université
    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteRepository.deleteById(id);
    }
}