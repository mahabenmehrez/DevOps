package com.example.maha_benmehrez1.repositories;

import com.example.maha_benmehrez1.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

    Long idBloc(long idBloc);
}
