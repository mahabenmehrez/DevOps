package com.example.maha_benmehrez1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idUniversite;
    private String nomUniversite;
    private String addresse;
    @OneToOne
    Foyer foyer;

    public void setNomUniversite(String nomUniversite) {
    }

    public void setAddresse(String addresse) {
    }

    public void setFoyer(Foyer foyer) {
        
    }
}
