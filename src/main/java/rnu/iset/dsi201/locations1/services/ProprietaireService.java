package rnu.iset.dsi201.locations1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rnu.iset.dsi201.locations1.entities.Proprietaire;
import rnu.iset.dsi201.locations1.repositories.ProprietaireRepository;

@Service
public class ProprietaireService {

	@Autowired
	ProprietaireRepository proprietaire;
	
	public Proprietaire createProprietaire(Proprietaire p) {
		return proprietaire.save(p);
	}
	
	public Proprietaire updateProprietaire(Proprietaire p,Long id) {
		p.setId(id);
		proprietaire.save(p);
		return p;
	}

	
	
	public boolean deleteProprietaire(int id) {
		proprietaire.deleteById(id);
		return true;
	}
	
	
	public Proprietaire getProprietaire(int id){
		Optional<Proprietaire> p=proprietaire.findById(id);
			return p.get();
	}
	
	
	public List<Proprietaire> getAllProprietaire() {
		return  proprietaire.findAll();
	}
}
