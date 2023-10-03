package rnu.iset.dsi201.locations1.repositories;

import jakarta.transaction.Transactional;
import rnu.iset.dsi201.locations1.entities.Habitant;


@Transactional

public interface HabitantRepository extends PersonneRepository<Habitant>{

}
