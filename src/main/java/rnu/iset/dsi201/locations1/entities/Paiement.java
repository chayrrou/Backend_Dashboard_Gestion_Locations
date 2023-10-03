package rnu.iset.dsi201.locations1.entities;

import java.io.Serializable;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Paiement implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private float montant;
	private LocalDate date;
	
	@ManyToOne
	private Logement logement;
	
	
	public Paiement() {}

	public Paiement(Long id, float montant, LocalDate date) {
		super();
		this.id = id;
		this.montant = montant;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Paiement [id=" + id + ", montant=" + montant + ", date=" + date + "]";
	}
	
}
