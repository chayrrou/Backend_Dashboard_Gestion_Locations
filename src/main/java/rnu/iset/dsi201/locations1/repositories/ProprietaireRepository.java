package rnu.iset.dsi201.locations1.repositories;

import jakarta.transaction.Transactional;
import rnu.iset.dsi201.locations1.entities.Proprietaire;

@Transactional
public interface ProprietaireRepository extends PersonneRepository<Proprietaire>{

}
