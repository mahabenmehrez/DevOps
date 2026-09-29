package com.example.maha_benmehrez1.repositories;

import com.example.maha_benmehrez1.Entities.Bloc;
import com.example.maha_benmehrez1.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
