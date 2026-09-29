package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Foyer;
import com.example.maha_benmehrez1.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyers")
@AllArgsConstructor
public class FoyerController {

    private FoyerRepository foyerRepository;

    // ✅ Récupérer tous les foyers
    @GetMapping
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    // ✅ Récupérer un foyer par ID
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Foyer non trouvé"));
    }

    // ✅ Ajouter un foyer
    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    // ✅ Modifier un foyer
    @PutMapping("/{id}")
    public Foyer updateFoyer(@PathVariable Long id,
                             @RequestBody Foyer foyerDetails) {

        Foyer foyer = foyerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Foyer non trouvé"));

        foyer.setNomFoyer(foyerDetails.getNomFoyer());
        foyer.setCapaciteFoyer(foyerDetails.getCapaciteFoyer());

        return foyerRepository.save(foyer);
    }

    // ✅ Supprimer un foyer
    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerRepository.deleteById(id);
    }
}