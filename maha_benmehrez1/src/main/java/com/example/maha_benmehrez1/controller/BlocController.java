package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Bloc;
import com.example.maha_benmehrez1.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocs")
@AllArgsConstructor
public class BlocController {

    private BlocRepository blocRepository;

    // ✅ Récupérer tous les blocs
    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    // ✅ Récupérer un bloc par ID
    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable Long id) {
        return blocRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé"));
    }

    // ✅ Ajouter un bloc
    @PostMapping
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocRepository.save(bloc);
    }

    // ✅ Modifier un bloc
    @PutMapping("/{id}")
    public Bloc updateBloc(@PathVariable Long id, @RequestBody Bloc blocDetails) {
        Bloc bloc = blocRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé"));

        bloc.setNomBloc(blocDetails.getNomBloc());
        bloc.setCapaciteBloc(blocDetails.getCapaciteBloc());

        return blocRepository.save(bloc);
    }

    // ✅ Supprimer un bloc
    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocRepository.deleteById(id);
    }
}