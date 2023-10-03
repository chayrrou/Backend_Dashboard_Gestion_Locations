package rnu.iset.dsi201.locations1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import rnu.iset.dsi201.locations1.entities.Personne;

@NoRepositoryBean
public interface PersonneRepository <T extends Personne> extends JpaRepository<T, Integer>{

}
