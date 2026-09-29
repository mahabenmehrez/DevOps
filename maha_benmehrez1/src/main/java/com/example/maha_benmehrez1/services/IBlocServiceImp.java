package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Bloc;
import com.example.maha_benmehrez1.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBlocServiceImp implements IBlocService {
    @Autowired

    ///private  BlocRepository reservationRepository;
    private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieverAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieverBloc(Bloc bloc) {
        return bloc;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc deleteBloc(Bloc bloc) {
        if (bloc != null) {
            blocRepository.delete(bloc);
        }
        return bloc;
    }
}
