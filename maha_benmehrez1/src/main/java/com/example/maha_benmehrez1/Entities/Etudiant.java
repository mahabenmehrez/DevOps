package com.example.maha_benmehrez1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;

    public void setNomEt(String nomEt) {
    }

    public void setPrenomEt(String prenomEt) {
    }

    public void setCin(long cin) {
    }

    public void setEcole(String ecole) {
    }

    public void setDateNaissance(Date dateNaissance) {
        
    }
}
