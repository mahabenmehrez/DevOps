package com.example.maha_benmehrez1.controller;

import com.example.maha_benmehrez1.Entities.Reservation;
import com.example.maha_benmehrez1.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private ReservationRepository reservationRepository;

    // 🔹 Récupérer toutes les réservations
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // 🔹 Récupérer une réservation par ID
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable String id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée"));
    }

    // 🔹 Ajouter une réservation
    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // 🔹 Modifier une réservation
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable String id,
                                         @RequestBody Reservation reservationDetails) {

        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée"));

        reservation.setAnneeUniversitaire(reservationDetails.getAnneeUniversitaire());
        reservation.setEstValide(reservationDetails.isEstValide());
        reservation.setEtudiants(reservationDetails.getEtudiants());

        return reservationRepository.save(reservation);
    }

    // 🔹 Supprimer une réservation
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable String id) {
        reservationRepository.deleteById(id);
    }
}