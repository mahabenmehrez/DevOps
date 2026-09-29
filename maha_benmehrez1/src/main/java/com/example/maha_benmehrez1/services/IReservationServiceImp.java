package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Reservation;
import com.example.maha_benmehrez1.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IReservationServiceImp implements IReservationService {
    @Autowired

    private  ReservationRepository reservationRepositoryFinal;
    private ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieverAllReservations() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation retrieverReservation(Reservation reservation) {
        return reservation;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation deleteReservation(Reservation reservation) {
        if (reservation != null) {
            reservationRepository.delete(reservation);
        }
        return reservation;
    }
}
