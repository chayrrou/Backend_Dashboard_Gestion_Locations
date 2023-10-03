package rnu.iset.dsi201.locations1.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Logement implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String adresse;
	private String description;
	private float prix;
	
	
	@ManyToOne
	private Habitant habitant;
	@ManyToOne
	private Proprietaire proprietaire;
	@OneToMany(mappedBy="logement")
	private List<Paiement> paiements;
	
	public Logement() {}
	
	public Logement(Long id, String adresse, String description, float prix) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.description = description;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Logement [id=" + id + ", adresse=" + adresse + ", description=" + description + ", prix=" + prix + "]";
	}
	

}
