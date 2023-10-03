package rnu.iset.dsi201.locations1.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Proprietaire  extends Personne{

	@OneToMany(mappedBy="proprietaire")
	private List<Logement> logements;
}
