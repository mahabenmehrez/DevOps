package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Chambre;
import com.example.maha_benmehrez1.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambres")
@AllArgsConstructor
public class ChambreController {

    private ChambreRepository chambreRepository;

    // ✅ Récupérer toutes les chambres
    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    // ✅ Récupérer une chambre par ID
    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
    }

    // ✅ Ajouter une chambre
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    // ✅ Modifier une chambre
    @PutMapping("/{id}")
    public Chambre updateChambre(@PathVariable Long id,
                                 @RequestBody Chambre chambreDetails) {

        Chambre chambre = chambreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));

        chambre.setNumeroChambre(chambreDetails.getNumeroChambre());
        chambre.setTypeC(chambreDetails.getTypeC());
        chambre.setBloc(chambreDetails.getBloc());

        return chambreRepository.save(chambre);
    }

    // ✅ Supprimer une chambre
    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreRepository.deleteById(id);
    }
}