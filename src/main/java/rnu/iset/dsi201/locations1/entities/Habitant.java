package rnu.iset.dsi201.locations1.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Habitant extends Personne{
	
	private String profession;
	
	@OneToMany(mappedBy="habitant")
	private List<Logement> logements;
	
	
	public Habitant() {}
	
	public Habitant(Long id, String nom, String prenom, int telephone, String mail,String profession) {
		super(id,nom,prenom,telephone,mail);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Habitant [personne =" + super.toString() +"profession=" + profession + "]";
	}
}
