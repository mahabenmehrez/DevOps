package com.example.maha_benmehrez1.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    public TypeChambre typeC;
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private List<Reservation> reservation;

    public void setNumeroChambre(long numeroChambre) {
    }

    public void setTypeC(TypeChambre typeC) {
    }

    public void setBloc(Bloc bloc) {
        
    }
}
