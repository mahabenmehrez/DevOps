package com.example.maha_benmehrez1.repositories;

import com.example.maha_benmehrez1.Entities.Bloc;
import com.example.maha_benmehrez1.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
