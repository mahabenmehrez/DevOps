package com.example.maha_benmehrez1.services;
import com.example.maha_benmehrez1.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieverAllFoyers();
    Foyer retrieverFoyer(Foyer foyer);
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    Foyer deleteFoyer(Foyer foyer);
}
