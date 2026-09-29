package com.example.maha_benmehrez1.services;

import com.example.maha_benmehrez1.Entities.Bloc;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieverAllBlocs();
    Bloc retrieverBloc(Bloc bloc);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    Bloc deleteBloc(Bloc bloc);
}
