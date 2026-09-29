package com.example.maha_benmehrez1.services;
import com.example.maha_benmehrez1.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieverAllReservations();
    Reservation retrieverReservation(Reservation reservation);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    Reservation deleteReservation(Reservation reservation);
}


